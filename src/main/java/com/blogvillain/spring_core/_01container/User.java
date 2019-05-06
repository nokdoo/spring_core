/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.blogvillain.spring_core._01container;

/**
 *
 * @author nokdoot
 */
public class User {
    private String    id;
    private String  Name;
    private Role    role;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        System.out.println(id);
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
}
