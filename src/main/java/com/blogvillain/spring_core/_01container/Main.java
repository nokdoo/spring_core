/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.blogvillain.spring_core._01container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
        
          |-------|              |---------------|
          | java  |  <---------- |     beans     |
          | class |   follow     |      in       |
          |       |   definition | configuration |
          |-------|   (1)        |---------------|
                                         ^
        ================================ | ================================
        ================================ | loads (3) ====================== 
        ================================ | ================================
                                         |
                                   |-----------|   (4)   |---------|
              -------------------->| container | ------> | objects |
              |                    |-----------|         |---------|
              |                          ^                  
        ===== | ======================== | ================================
        ===== | initiate (2) =========== | find and get object (5) ========
        ===== | ======================== | ================================
              |                          |                   
          |-------|                      |
          | users | <--------------------|
          |-------|      

        */

/**
 *
 * @author nokdoot
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        User user = context.getBean(User.class);
        System.out.println("breakpoint");
    }
}
