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
   
     public static void runtoJSON(DefaultListModel<RunLogEntry> dlm){
          JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved");
         PrintWriter out = null;
     try{
         JFileChooser jfc = new JFileChooser();
         int ret = jfc.showSaveDialog(null);
         if(ret != JFileChooser.APPROVE_OPTION)
                return;
            File f = jfc.getSelectedFile();
          out = new PrintWriter(f);
          for(int i=0; i<dlm.size(); i++){
              RunLogEntry e =dlm.get(i);
              out.print(g.toJson(e));
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
     
     
     public static void itemtoJSON(DefaultListModel<GameItem> dlm){
          JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved");
         PrintWriter out = null;
     try{
         JFileChooser jfc = new JFileChooser();
         int ret = jfc.showSaveDialog(null);
         if(ret != JFileChooser.APPROVE_OPTION)
                return;
            File f = jfc.getSelectedFile();
          out = new PrintWriter(f);
          for(int i=0; i<dlm.size(); i++){
              GameItem e =dlm.get(i);
              out.print(g.toJson(e));
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
    
     
     public static void survivortoJSON(DefaultListModel<Survivor> dlm){
          JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved");
         PrintWriter out = null;
     try{
         JFileChooser jfc = new JFileChooser();
         int ret = jfc.showSaveDialog(null);
         if(ret != JFileChooser.APPROVE_OPTION)
                return;
            File f = jfc.getSelectedFile();
          out = new PrintWriter(f);
          for(int i=0; i<dlm.size(); i++){
              Survivor e =dlm.get(i);
              out.print(g.toJson(e));
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
     
     public static void enemytoJSON(DefaultListModel<Enemy> dlm){
          JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved");
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
              out.print(g.toJson(e));
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
}
