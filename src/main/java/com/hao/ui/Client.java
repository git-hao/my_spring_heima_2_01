package com.hao.ui;

import com.hao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Describe com.com.hao.ui
 * @Auther wenhao chen
 * @CreateDate 2019/7/28
 * @Version 1.0
 * 模拟表现层，调用业务层
 */
public class Client {
    public static void main(String[] args){

        //获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //换位子类，调用close方法，验证销毁
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean
        UserService us = (UserService) ac.getBean("userService");

        //验证@Scope注解
        UserService us2 = (UserService) ac.getBean("userService");
        System.out.println(us == us2);

        us.saveUser();
        //调用close方法，验证销毁
        ac.close();

    }

}
