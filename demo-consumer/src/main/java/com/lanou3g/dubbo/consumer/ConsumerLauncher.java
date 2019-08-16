package com.lanou3g.dubbo.consumer;

import com.lanou3g.dubbo.api.IHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerLauncher {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.start();

        IHello helloService = ctx.getBean(IHello.class);
        String msg = helloService.sayHello();
        System.out.println(msg);


        String msg1 = helloService.sayHello("World!");
        System.out.println(msg1);
    }

}
