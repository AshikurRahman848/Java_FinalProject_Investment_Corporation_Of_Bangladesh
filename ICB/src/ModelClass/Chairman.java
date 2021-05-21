/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 *
 * @author User
 */
public class Chairman extends Employee{
    
      public static void viewEmployee(TableView tableView) throws FileNotFoundException{              
         File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
     
            f = new File("Employee.txt");
            sc = new Scanner(f);
            if(f.exists()){
              
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    
                                  Employee newEmployee = new Employee(tokens[0],tokens[1], tokens[2])
                                       
                                    ;
                                    
                                    tableView.getItems().add(newEmployee);
                   
                }
            }
            else 
                System.out.println("Not found");
        } 
       
      
    
   public static void viewInvestor(TableView tableView) throws FileNotFoundException{              
         File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
     
            f = new File("Investor.txt");
            sc = new Scanner(f);
            if(f.exists()){
              
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    
                                  Investor newEmployee = new Investor(tokens[0],tokens[1], tokens[2])
                                       
                                    ;
                                    
                                    tableView.getItems().add(newEmployee);
                   
                }
            }
            else 
                System.out.println("Not found");
        } 
       
    
     public static void viewComplaint(TextArea txt) throws FileNotFoundException{
    
           File file = new File("Complaint.txt");
        Scanner sc; String str=null;
        
            sc = new Scanner(file);
           txt.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
              txt.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        }   
    
    
    
  /*public static void updateCSE(String v1, String v2, String v3,String v4) throws FileNotFoundException, IOException{
    
    ArrayList<CSE> i;  
        i = new  ArrayList<CSE>();
        CSE ps1 ;
        
        i.add(
             new CSE( 
                     v1,v2,v3,v4
                    
                   )
                
        );
        
      
        
        
       
                FileWriter fw = null;
             
                File f = new File("CSE.txt");
                if(f.exists()){ fw = new FileWriter(f,true);}
                else{
                fw = new FileWriter(f);
                }
              
                String str="";
                for(CSE in: i){
                    str += in.getV1()+","+in.getV2()+","+in.getV3()+","+in.getV4()+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);
                fw.close();
                
       
        } */
    
  public static void updateDSE(String v1, String v2, String v3,String v4,String shareId) throws FileNotFoundException, IOException{
    
   ArrayList<DSE> i;  
        i = new  ArrayList<DSE>();
        DSE ps1 ;
        
        i.add(
             new DSE( 
                     v1,v2,v3,v4,shareId
                    
                   )
                
        );
        
      
        
        
       
                FileWriter fw = null;
             
                File f = new File("DSE.txt");
                if(f.exists()){ fw = new FileWriter(f,true);}
                else{
                fw = new FileWriter(f);
                }
              
                String str="";
                for(DSE in: i){
                    str += in.getV1()+","+in.getV2()+","+in.getV3()+","+in.getV4()+","+shareId+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);
                fw.close();
        }
    
    

    
    
}
