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
public class StockRequest implements Serializable{
    
    private String name, share;
    
  

    public StockRequest(String name, String share) {
        this.name = name;
        this.share = share;
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
    
    @Override
    public String toString() {
        return name + " " + share+  "\n";
    }
    
    
}
