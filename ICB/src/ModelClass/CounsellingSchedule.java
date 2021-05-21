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
public class CounsellingSchedule implements Serializable{
    
    private String c_name,i_name, date;
    
    private String time;

    public CounsellingSchedule(String c_name, String i_name, String date, String time) {
        this.c_name = c_name;
        this.i_name = i_name;
        this.date = date;
        this.time = time;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getI_name() {
        return i_name;
    }

    public void setI_name(String i_name) {
        this.i_name = i_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
     @Override
    public String toString() {
        return c_name + " ," + i_name+ ", " + date+" ,"+time+  "\n";
    }
}
