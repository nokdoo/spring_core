/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_core._05aop.delaring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
     
    @Before("execution(* com.blogvillain.spring_core._05aop.delaring.aspect.EmployeeManagerImpl.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint)
    {
        System.out.println("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
    }
     
    @Before("execution(* com.blogvillain.spring_core._05aop.delaring.aspect.EmployeeManagerImpl.getEmployeeById(..))")
    public void logBeforeGetEmployee(JoinPoint joinPoint)
    {
        System.out.println("****LoggingAspect.logBeforeGetEmployee() : " + joinPoint.getSignature().getName());
    }
     
    @Before("execution(* com.blogvillain.spring_core._05aop.delaring.aspect.EmployeeManagerImpl.createEmployee(..))")
    public void logBeforeCreateEmployee(JoinPoint joinPoint)
    {
        System.out.println("****LoggingAspect.logBeforeCreateEmployee() : " + joinPoint.getSignature().getName());
    }
}
