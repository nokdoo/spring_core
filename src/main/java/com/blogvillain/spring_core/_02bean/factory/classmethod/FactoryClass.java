/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_core._02bean.factory.classmethod;

/**
 *
 * @author nokdoot
 */
public class FactoryClass {

    public static InstanceClass createInstance(){
        return new InstanceClass();
    }
}
