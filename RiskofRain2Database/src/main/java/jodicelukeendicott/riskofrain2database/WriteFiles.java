/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;
    import com.google.gson.Gson;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author lukej
 */
public class WriteFiles {
     public static Gson g = new Gson();
   
     public static void printRun(DefaultListModel<RunLogEntry> dlm, int choice){
         if(choice ==1){ 
         JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved");
         }
         else if(choice ==2){
              JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.txt) due to that being the file type that is going to be saved");
            }
         PrintWriter out = null;
     try{
         JFileChooser jfc = new JFileChooser();
         int ret = jfc.showSaveDialog(null);
         if(ret != JFileChooser.APPROVE_OPTION)
                return;
            File f = jfc.getSelectedFile();
          out = new PrintWriter(f);
          for(int i=0; i<dlm.size(); i++){
              RunLogEntry log =dlm.get(i);
              if(choice ==1){
              out.print(g.toJson(log));
              }
              else if(choice ==2){
                  out.print(log.printInfo());
              }
          }
          JOptionPane.showMessageDialog(null, "File has been Saved Successfully. Have a good day!");
     }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Invalid file please try again.", "Invalid file", JOptionPane.ERROR_MESSAGE);
        }
     catch (IOException ex) {
            System.out.println(ex);
        }
     finally{
         out.close();
     }
     }
     
     
     public static void printItem(DefaultListModel<GameItem> dlm, int choice){
          if(choice ==1){ 
         JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved");
         }
         else if(choice ==2){
              JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.txt) due to that being the file type that is going to be saved");
         }
         PrintWriter out = null;
     try{
         JFileChooser jfc = new JFileChooser();
         int ret = jfc.showSaveDialog(null);
         if(ret != JFileChooser.APPROVE_OPTION)
                return;
            File f = jfc.getSelectedFile();
          out = new PrintWriter(f);
          for(int i=0; i<dlm.size(); i++){
              GameItem itm =dlm.get(i);
              if(choice==1){
              out.print(g.toJson(itm));
              }
              else if(choice==2){
                  out.print(itm.printInfo());
              }
          }
          JOptionPane.showMessageDialog(null, "File has been Saved Successfully. Have a good day!");
     }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Invalid file please try again.", "Invalid file", JOptionPane.ERROR_MESSAGE);
        }
     catch (IOException ex) {
            System.out.println(ex);
        }
     finally{
         out.close();
     }
     }
    
     
     public static void printSurvivor(DefaultListModel<Survivor> dlm, int choice){
                 if(choice ==1){ 
         JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved");
         }
         else if(choice ==2){
              JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.txt) due to that being the file type that is going to be saved");
         }
         PrintWriter out = null;
     try{
         JFileChooser jfc = new JFileChooser();
         int ret = jfc.showSaveDialog(null);
         if(ret != JFileChooser.APPROVE_OPTION)
                return;
            File f = jfc.getSelectedFile();
          out = new PrintWriter(f);
          for(int i=0; i<dlm.size(); i++){
              Survivor surv =dlm.get(i);
              if(choice==1){
              out.print(g.toJson(surv));
              }
              else if(choice ==2){
                  out.print(surv.printInfo());
              }
          }
          JOptionPane.showMessageDialog(null, "File has been Saved Successfully. Have a good day!");
     }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Invalid file please try again.", "Invalid file", JOptionPane.ERROR_MESSAGE);
        }
     catch (IOException ex) {
            System.out.println(ex);
        }
     finally{
         out.close();
     }
     }
     
     public static void printEnemy(DefaultListModel<Enemy> dlm, int choice){
         if(choice ==1){ 
         JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved");
         }
         else if(choice ==2){
              JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.txt) due to that being the file type that is going to be saved");
         }
         PrintWriter out = null;
     try{
         JFileChooser jfc = new JFileChooser();
         int ret = jfc.showSaveDialog(null);
         if(ret != JFileChooser.APPROVE_OPTION)
                return;
            File f = jfc.getSelectedFile();
          out = new PrintWriter(f);
          for(int i=0; i<dlm.size(); i++){
              Enemy e =dlm.get(i);
              if(choice==1){
              out.print(g.toJson(e));
              }
              else if(choice ==2){
                out.print(e.printInfo());
              }
          }
          JOptionPane.showMessageDialog(null, "File has been Saved Successfully. Have a good day!");
     }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Invalid file please try again.", "Invalid file", JOptionPane.ERROR_MESSAGE);
        }
     catch (IOException ex) {
            System.out.println(ex);
        }
     finally{
         out.close();
     }
     }
     /*
     public void saveRuns(DefaultListModel<RunLogEntry> dlm){
         PrintWriter save =null;
         try{
         File runlog = new File(getClass().getResource("runlog.json").getFile());
         save = new PrintWriter(runlog);
         for(int i=0; i>dlm.size(); i++){
             save.print(g.toJson(dlm.get(i)));
         }
         }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "file to save not found.");
        } 
     }
     */
         
         
     }
   
     //

