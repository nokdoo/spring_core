/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.blogvillain.spring_code.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author nokdoot
 */
public class Main {
    public static void main(String[] args) {

        /*
             ----------
             |  beans  |
             |   in    |
             |container|
             |_________|
                  |
                  v
            | init object |  --->  object
        */
        
        ApplicationContext context = new ClassPathXmlApplicationContext("container.xml");
        User user = context.getBean(User.class);
        System.out.println(user.getId());
    }
    
}
