package cn.bugstack.springframework.test;

import cn.bugstack.springframework.BeanDefinition;
import cn.bugstack.springframework.BeanFactory;
import cn.bugstack.springframework.test.bean.UserService;
import org.junit.Assert;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_BeanFactory() {
        BeanFactory beanFactory = new BeanFactory();
        UserService userService = new UserService();
        BeanDefinition beanDefinition = new BeanDefinition(userService);
        beanFactory.registerBean("userService",beanDefinition);

        UserService userService1 = (UserService) beanFactory.getBean("userService");

    }

}
