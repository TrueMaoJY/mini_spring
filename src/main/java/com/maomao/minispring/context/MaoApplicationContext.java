package com.maomao.minispring.context;

/**
 * @author MaoJY
 * @create 2022-03-19 20:08
 * @Description:
 */

import com.maomao.minispring.context.annotion.ComponentScan;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
1.获得包扫描路径，创建bean
*/
public class MaoApplicationContext {
    private  Class configClass;
    private List<Class> classList=new ArrayList<>();
    public MaoApplicationContext(Class configClass) {
        this.configClass = configClass;
        //扫描得到所有的class
        scan(configClass);
    }
    /**
    * Description:扫描componentScan下的所有类
    * date: 2022/3/19 21:15
    * @author: MaoJY
    * @since JDK 1.8
    */
    private void scan(Class configClass) {
        //获得包扫描路径，创建bean
        ComponentScan componentScan = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
        String path = componentScan.value();//com.maomao.minispring.service
        //实际扫描的是字节码文件
        path=path.replace(".","/");//com/maomao/minispring/service
        //获取applicationClassLoader
        ClassLoader classLoader = MaoApplicationContext.class.getClassLoader();
        //从target/classes下获取
        URL url = classLoader.getResource(path);
        //获取文件夹
        File file=new File(url.getFile());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                String absolutePath = f.getAbsolutePath();//全路径
                absolutePath=absolutePath.substring(absolutePath.indexOf("com"),absolutePath.indexOf(".class"));
                absolutePath=absolutePath.replace("\\",".");
                try {
                    //加载类
                    Class<?> clazz = classLoader.loadClass(absolutePath);
                    classList.add(clazz);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Object getBean(String beanName) {
        return null;
    }
}