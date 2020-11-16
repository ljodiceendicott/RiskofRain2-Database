/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lukej
 */
public class ReadFiles{
    private Scanner x;
    public ArrayList<GameItem> alGameItem;
    public ArrayList<Double> stacks;
    
    public ReadFiles() throws FileNotFoundException{
       
        //this.readEntityFile();
    }
    
    public ArrayList<GameItem> readItemFile(){
  //fix readin file, can not find file specified
  //should try reading in file using other methods.
        File text= new File("C:\\Users\\lukej\\Desktop\\risk of rain 2 database\\RiskofRain2Database\\src\\main\\resources\\formatedROR2data.txt");
    
    String pickupdescr = null;   
    Scanner x;
     alGameItem = new ArrayList<GameItem>();
        try {
            x = new Scanner(text); 
            while(x.hasNext()){

       String itemType= x.next();
       String name= x.next();
       String pickupdesc= x.nextLine();
       if("".equals(pickupdesc)){
       pickupdescr= x.nextLine();
       }
       String effect = x.nextLine();
       stacks = new ArrayList<>();
       for(int i = 0; i<11; i++){
          String numstr = x.next();
          double num = Double.parseDouble(numstr);
          stacks.add(num);
       }
       
       
       
       
       System.out.println("here");
       
       //initialize new Gameitem
       //String rarity, String name, String pickuptext, String effect, ArrayList<Double> stack
       if("".equals(pickupdesc)){
       GameItem itm = new GameItem(itemType, name, pickupdescr,effect,stacks);
       alGameItem.add(itm);
       }
       else{
         GameItem itm = new GameItem(itemType, name, pickupdesc,effect,stacks);  
         alGameItem.add(itm);
         
       }
        
      //adding GameItem itm to the hashtable location given by the itm as well as the rarity of the itm
       //adding game item to an arraylist making it so that I can put into dlm easier
    }
            
     } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    return alGameItem;
}
    public void readEntityFile() throws FileNotFoundException{
        
    }
    //READ IN PLAYERS/ENEMIES
    
    }

