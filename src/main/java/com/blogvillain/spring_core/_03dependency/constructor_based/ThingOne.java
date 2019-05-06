/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogvillain.spring_core._03dependency.constructor_based;

import java.beans.ConstructorProperties;

/**
 *
 * @author nokdoot
 */
public class ThingOne {
    
    
//    1 in dependency-with-constructor.xml
//    public ThingOne(ThingTwo two, ThingThree three){
//        this.two = two;
//        this.three = three;
//    }
    
    
    
//    2, 3, 4 in dependency-with-constructor.xml
    public ThingOne(int two, String three){
        System.out.println(two);
        System.out.println(three);
    }
    
}
