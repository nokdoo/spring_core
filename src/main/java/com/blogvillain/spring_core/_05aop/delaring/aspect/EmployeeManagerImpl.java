/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_core._05aop.delaring.aspect;

public class EmployeeManagerImpl implements EmployeeManager
{
    public void getEmployeeById() {
        System.out.println("Method getEmployeeById() called");
    }
 
    public void getAllEmployee() {
        System.out.println("Method getAllEmployee() called");
    }
 
    public void createEmployee() {
        System.out.println("Method createEmployee() called");
    }
 
    public void deleteEmployee() {
        System.out.println("Method deleteEmployee() called");
    }
 
    public void updateEmployee() {
        System.out.println("Method updateEmployee() called");
    }
}
