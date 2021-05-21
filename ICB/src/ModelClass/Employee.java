/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClass;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Employee implements Serializable{
    
    private String name, position;
    
    private String degree;

    public Employee(String name, String position, String degree) {
        this.name = name;
        this.position = position;
        this.degree = degree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getDegree() {
        return degree;
    }
    

    
 @Override
    public String toString() {
        return name + " " + position+ " " + degree+  "\n";
    }
}
