/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClass;

/**
 *
 * @author User
 */
public class DSE {
    
    private String v1, v2,v3,v4,v5;
    


    public DSE(String v1,String v2, String v3, String v4,String v5) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
      
    }

   

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public void setV3(String v3) {
        this.v3 = v3;
    }

    public void setV4(String v4) {
        this.v4 = v4;
    }

    public String getV1() {
        return v1;
    }

    public String getV2() {
        return v2;
    }

    public String getV3() {
        return v3;
    }

    public String getV4() {
        return v4;
    }



    
    public String toString() {
        return v1 + "     " + v2+ "     " + v3+ "        " +v4+ "\n";
    }
    
    
}
