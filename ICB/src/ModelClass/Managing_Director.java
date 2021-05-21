/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 *
 * @author User
 */
public class Managing_Director {
    
    
    
    
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
                    
                                  CSE newEmployee = new CSE(tokens[0],tokens[1], tokens[2],tokens[3]);
                                       
                                    
                                    
                                    tableView.getItems().add(newEmployee);
                   
                }
            }
            else 
                System.out.println("Not found");
        } 
    public static void viewDSE(TableView tableView,Label statusLabel) throws FileNotFoundException{              
         File f = null;
        //FileReader fw = null;
        
        float sum  =0;
        int count = 0;
        
        Scanner sc; String str; String[] tokens;
     
            f = new File("DSE.txt");
            sc = new Scanner(f);
            if(f.exists()){
              
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    
                                  DSE newEmployee = new DSE(tokens[0],tokens[1], tokens[2],tokens[3],tokens[4])
                                       
                                    ;
                                  
                                  sum+= Integer.parseInt(tokens[0]);
                                  count++;
                                    
                                    tableView.getItems().add(newEmployee);
                   
                }
                
                statusLabel.setText(Float.toString(sum/count));
            }
            else 
                System.out.println("Not found");
        } 
    
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
    
}
