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
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 *
 * @author User
 */
public class Assistant_Manager {
    
     public static void addEmp(String s1, String s2, String s3, Label msglabel) throws IOException{
    
        ArrayList<Employee> psArr;  
        psArr = new  ArrayList<Employee>();
        Employee ps1 ;
        
        psArr.add(
             new Employee(  
                    s1,s2,s3
                   )
                
        );
        
      
        
        
       
                FileWriter fw = null;
             
                File f = new File("Employee.txt");
                if(f.exists()){ fw = new FileWriter(f,true);}
                else{
                fw = new FileWriter(f);
                }
              
                String str="";
                for(Employee ps: psArr){
                    str += ps.getName()+","+ps.getPosition()+","+ps.getDegree()+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);
                fw.close();
                
               msglabel.setText("Saved to the system");
            }  
    
    
    
    
      public static void addInvestor(String s1, String s2, String s3, Label msglabel) throws IOException{
    
        ArrayList<Investor> i;  
        i = new  ArrayList<Investor>();
        Investor ps1 ;
        
        i.add(
             new Investor(  
                    s1,s2,s3
                   )
                
        );
        
      
        
        
       
                FileWriter fw = null;
             
                File f = new File("Investor.txt");
                if(f.exists()){ fw = new FileWriter(f,true);}
                else{
                fw = new FileWriter(f);
                }
              
                String str="";
                for(Investor in: i){
                    str += in.getName()+","+in.getAddress()+","+in.getContact()+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);
                fw.close();
                
               msglabel.setText("Saved to the system");
            }  
      
      
     /* public static void updateCSE(String v1, String v2, String v3,String v4) throws FileNotFoundException, IOException{
    
    ArrayList<CSE> i;  
        i = new  ArrayList<CSE>();
        CSE ps1 ;
        
        i.add(
             new CSE( 
                     v1,v2,v3,v4,
                    
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
                
       
        } 
      */
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
            
    
     public static void addOwnerShip(String s1, String s2, String s3, Label msglabel) throws IOException{
    
        ArrayList<OwnerShip> i;  
        i = new  ArrayList<OwnerShip>();
        OwnerShip ps1 ;
        
        i.add(
             new OwnerShip(  
                    s1,s2,s3
                   )
                
        );
        
      
        
        
       
                FileWriter fw = null;
             
                File f = new File("OwnerShip.txt");
                if(f.exists()){ fw = new FileWriter(f,true);}
                else{
                fw = new FileWriter(f);
                }
              
                String str="";
                for(OwnerShip in: i){
                    str += in.getName()+","+in.getNoOfshare()+","+in.getPercentage()+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);
                fw.close();
                
               msglabel.setText("Saved to the system");
            }  
    public static void addPolicy(String s1, Label msglabel) throws IOException{
    
                 FileWriter fw = null;
               
                File f = new File("Policy.txt");
                if(f.exists()){ fw = new FileWriter(f,true);}
                else{
                fw = new FileWriter(f);}
                String str="";
                
                    str += s1+"\n";
                   
                
                fw.write(str);
                fw.close();
                
               msglabel.setText("Saved to system");
            }
    
 
            }  
    
    
    
    
    
    
    
    
    
    
    

    

