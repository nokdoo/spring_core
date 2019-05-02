/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.blogvillain.spring_code._01container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author nokdoot
 */
public class Main {
    public static void main(String[] args) {

        /*
          |-------|      (1)     |---------------|
          | java  |  <---------- |     beans     |
          | class |   follow     |      in       |
          |       |   definition | configuration |
          |-------|              |---------------|
                                         ^
        ================================ | ================================
        ================================ | loads (3) ====================== 
        ================================ | ================================
                                         |
                                   |-----------|   (4)   |---------|
          (2) -------------------->| container | 1-----M | objects |
              |                    |-----------|         |---------|
              |                          ^                  
        ===== | ======================== | ================================
        ===== | initiate =============== | ================================
        ===== | ======================== | ================================
              |                          |                   
          | users | <--- find and get ---|
                         object
                         (5)         
                       
                       
        */
        
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        User user = context.getBean(User.class);
        System.out.println("breakpoint");
    }
    
}
