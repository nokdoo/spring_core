/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_core._04method.injection.undesirable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author nokdoot
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext contextHavingA = new ClassPathXmlApplicationContext(
                "_04method.injection.undesirable.xml");
        
        ApplicationContext contextHavingB = new ClassPathXmlApplicationContext(
                "_04method.injection.undesirable.xml");
        
        A a = contextHavingA.getBean(A.class);
        a.setApplicationContext(contextHavingB);
        a.processB("&_&");
        System.out.println("breakpoint");
    }
}
