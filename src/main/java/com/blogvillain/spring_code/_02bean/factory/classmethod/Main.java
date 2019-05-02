/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_code._02bean.factory.classmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author nokdoot
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-with-classmethod.xml");
        InstanceClass instance = context.getBean("beanForInstance", InstanceClass.class);
        InstanceClass anotherIntance = context.getBean("anotherBeanForInstance", InstanceClass.class);
        System.out.println("breakpoint");
    }
}
