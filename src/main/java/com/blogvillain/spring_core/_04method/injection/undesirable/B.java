/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_core._04method.injection.undesirable;

/**
 *
 * @author nokdoot
 */
public class B {

    private String state;
    
    void setState(String state) {
        this.state = state;
    }
    
    public String getState() {
        return this.state;
    }

    B execute() {
        System.out.println("New B is executing with state : "+getState());
        return this;
    }
}