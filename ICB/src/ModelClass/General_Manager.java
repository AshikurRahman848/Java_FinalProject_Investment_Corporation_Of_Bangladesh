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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 *
 * @author User
 */
public class General_Manager {
    
    
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
       
           public static void viewPolicy(TextArea txt) throws FileNotFoundException{
    
           File file = new File("Policy.txt");
        Scanner sc; String str=null;
       
            sc = new Scanner(file);
           txt.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
              txt.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        }
           
           public static void updateCousellingSchedule(String v1, String v2, String v3,String v4) throws FileNotFoundException, IOException{
    
    ArrayList<CounsellingSchedule> i;  
        i = new  ArrayList<CounsellingSchedule>();
        CounsellingSchedule ps1 ;
        
        i.add(
             new CounsellingSchedule( 
                     v1,v2,v3,v4
                    
                   )
                
        );
        
      
        
        
       
                FileWriter fw = null;
             
                File f = new File("CounsellingSchedule.txt");
                if(f.exists()){ fw = new FileWriter(f,true);}
                else{
                fw = new FileWriter(f);
                }
              
                String str="";
                for(CounsellingSchedule in: i){
                    str += in.getC_name()+","+in.getI_name()+","+in.getDate()+","+in.getTime()+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);
                fw.close();
                
       
        } 
    
    }
       
       
    

