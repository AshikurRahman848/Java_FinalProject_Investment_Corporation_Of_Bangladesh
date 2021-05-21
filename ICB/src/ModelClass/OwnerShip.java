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
public class OwnerShip implements Serializable{
    
    private String name;
    private String noOfshare;
    
    private String percentage;

    public OwnerShip(String name, String noOfshare, String percentage) {
        this.name = name;
        this.noOfshare = noOfshare;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoOfshare() {
        return noOfshare;
    }

    public void setNoOfshare(String noOfshare) {
        this.noOfshare = noOfshare;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    
 @Override
    public String toString() {
        return name + "     " + noOfshare+ "     " + percentage+  "\n";
    }
}