/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_core._05aop.delaring.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author nokdoot
 */

public class Main {
    public static void main(String[] args) {
  
        ApplicationContext context = new ClassPathXmlApplicationContext("_05aop.delaring.aspect.xml");
        Main main = (Main) context.getBean("mainclass");
        main.TestPointCut();
        
        
        EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");
        manager.getEmployeeById();
        manager.createEmployee();
    }
    
    public void TestPointCut() {
        System.out.println("TestPointCut");
    }
}