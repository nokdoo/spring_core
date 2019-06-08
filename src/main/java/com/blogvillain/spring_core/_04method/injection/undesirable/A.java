/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_core._04method.injection.undesirable;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author nokdoot
 */

/**
 * If 'A' bean is singleton and 'B' bean is non-singleton, 
 * and we want 'A' to execute new 'B' every time, 
 * then 'A' must have container that provide creating 'B'.
 * But this approach is undesirable because 'A' is coupled to Spring Framework.
 */
public class A implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    
    public B processB(String state) {
        B b = createB();
        b.setState(state);
        return b.execute();
    }
    
    protected B createB() {
        return this.applicationContext.getBean("B", B.class);
    }
    
    @Override
    public void setApplicationContext( ApplicationContext applicationContext ) 
            throws BeansException{
        this.applicationContext = applicationContext;
    }
}
