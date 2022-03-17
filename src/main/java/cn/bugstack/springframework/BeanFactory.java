package cn.bugstack.springframework;

import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    private ConcurrentHashMap<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }
    public void registerBean(String name, BeanDefinition beanDefinition) {
        this.beanDefinitionMap.put(name,beanDefinition);
    }
}
