/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.control.TableView;

/**
 *
 * @author User
 */
public class Investor implements Serializable{
    
    private String name, contact;
    
    private String address;

    public Investor(String name, String address , String contact) {
        this.name = name;

        this.address = address;
                this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }
       public static void viewOwnerShip(TableView tableView) throws FileNotFoundException{              
         File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
     
            f = new File("OwnerShip.txt");
            sc = new Scanner(f);
            if(f.exists()){
              
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    
                                  OwnerShip newEmployee = new OwnerShip(tokens[0],tokens[1], tokens[2])
                                       
                                    ;
                                    
                                    tableView.getItems().add(newEmployee);
                   
                }
            }
            else 
                System.out.println("Not found");
        } 
       
       public static void sendStockBuyRequest(String v1, String v2) throws FileNotFoundException, IOException{
    
    ArrayList<StockRequest> i;  
        i = new  ArrayList<StockRequest>();
        StockRequest ps1 ;
        
        i.add(
             new StockRequest( 
                     v1,v2
                    
                   )
                
        );
        
      
        
        
       
                FileWriter fw = null;
             
                File f = new File("StockRequest.txt");
                if(f.exists()){ fw = new FileWriter(f,true);}
                else{
                fw = new FileWriter(f);
                }
              
                String str="";
                for(StockRequest in: i){
                    str += in.getName()+","+in.getShare()+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);
                fw.close();
                
       
        } 
    
    
    public static void viewCSE(TableView tableView) throws FileNotFoundException{              
         File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
     
            f = new File("CSE.txt");
            sc = new Scanner(f);
            if(f.exists()){
              
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    
                                  CSE newEmployee = new CSE(tokens[0],tokens[1], tokens[2],tokens[3])
                                       
                                    ;
                                    
                                    tableView.getItems().add(newEmployee);
                   
                }
            }
            else 
                System.out.println("Not found");
        } 
    
     public static void viewDSE(TableView tableView) throws FileNotFoundException{              
         File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
     
            f = new File("DSE.txt");
            sc = new Scanner(f);
            if(f.exists()){
              
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    
                                  DSE newEmployee = new DSE(tokens[0],tokens[1], tokens[2],tokens[3],tokens[4])
                                       
                                    ;
                                    
                                    tableView.getItems().add(newEmployee);
                   
                }
            }
            else 
                System.out.println("Not found");
        }
     
      public static void viewCounsellingSchedule(TableView tableView) throws IOException{
    
       File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
     
            f = new File("CounsellingSchedule.txt");
            sc = new Scanner(f);
            if(f.exists()){
              
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    
                                  CounsellingSchedule newEmployee = new CounsellingSchedule(tokens[0],tokens[1], tokens[2],tokens[3])
                                       
                                    ;
                                    
                                    tableView.getItems().add(newEmployee);
                   
                }
            }
            else 
                System.out.println("Not found");
        } 
    
    @Override
    public String toString() {
        return name + ", " +address + ", " + contact+  "\n";
    }
    
}
