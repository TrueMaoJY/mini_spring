package com.maomao.minispring.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MaoJY
 * @create 2022-03-19 19:41
 * @Description:简单的bean工厂，保存bean和获取bean
 */
public class BeanFactory {
    private Map<String,Object> beanMap=new HashMap<>();
    /**
    * Description:根据beanname和类型创建，存储bean
    * date: 2022/3/19 19:44
    * @author: MaoJY
    * @since JDK 1.8
    */
    public void registerBean(String name,Object bean){
        beanMap.put(name,bean);
    }
    /**
    * Description:根据beanname 获取bean'
    * date: 2022/3/19 19:45
    * @author: MaoJY
    * @since JDK 1.8
    */

    public Object getBean(String name){
        return beanMap.get(name);
    }
}