/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_code._02bean.factory.objectmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author nokdoot
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-with-objectmethod.xml");
        InstanceClass instance = context.getBean("forInstance", InstanceClass.class);
        InstanceClass anotherIntance = context.getBean("forAnotherInstance", InstanceClass.class);
        System.out.println("breakpoint");
    }
}
