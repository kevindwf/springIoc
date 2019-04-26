package com.kevin.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args){
        //3 method to add to spring context beans：1，xml; 2. add Component; 3. JavaConfig
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
        for (String item : ctx.getBeanDefinitionNames()) {
            System.out.println("context beans: " + item);
        }
        Boss boss = (Boss) ctx.getBean("boss");
        System.out.println(boss);

        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(HouseConfig.class);
        for (String item : ctx.getBeanDefinitionNames()) {
            System.out.println("context beans: " + item);
        }
        House house = (House) ctx2.getBean("house");
        System.out.println(house);
    }
}
