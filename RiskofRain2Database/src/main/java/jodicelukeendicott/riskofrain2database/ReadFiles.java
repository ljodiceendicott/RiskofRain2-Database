/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import com.google.gson.Gson;
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
    public ArrayList<Survivor> alSurvivor;
    public ArrayList<Double> stacks;
    public ArrayList<Ability> tempabil;
    public Gson g = new Gson();
    
    public ReadFiles() throws FileNotFoundException{
       
        //this.readEntityFile();
    }
    
    public ArrayList<GameItem> readItemtxtFile(){
  //fix readin file, can not find file specified
  //should try reading in file using other methods.
  
   //C:\Users\lukej\Desktop\risk of rain 2 database\RiskofRain2Database\src\main\java\jodicelukeendicott\riskofrain2database
  //"C:\\Users\\lukej\\Desktop\\risk of rain 2 database\\RiskofRain2Database\\src\\main\\resources\\survivordataformated.txt
  
  File text= new File("C:\\Users\\lukej\\Desktop\\risk of rain 2 database\\RiskofRain2Database\\src\\main\\resources\\formatedROR2data.txt");
  
    //File text = new File("..\\..\\resources\\formatedROR2data.txt");
//would like to make it a relative path rather than the absoulue path     
// File text= new File("formatedROR2data.txt");
    String pickupdescr = null;   
    Scanner x;
     alGameItem = new ArrayList<GameItem>();
        try {
            x = new Scanner(text); 
            while(x.hasNext()){
       String itemType= x.next();
       String nameuned= x.next();
       String name = nameuned.replace('#',' ');
       String pickupdesc= x.nextLine();
       if("".equals(pickupdesc)){
       pickupdescr= x.nextLine();
       }
       String effect = x.nextLine();
       stacks = new ArrayList<>();
       for(int i = 0; i<11; i++){
          String numstr = x.next();
          /* Tests to see if the items are being read in properly
          System.out.println(name);
          System.out.println(numstr);
          */
          double num = Double.parseDouble(numstr);
          stacks.add(num);
       }
       
       
       //Read through the file and see where I was missing the numbers
       
       
      
       
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
            x.close();
            
     } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    return alGameItem;
}
    public void readSurvivortxtFile() throws FileNotFoundException{
        File text= new File("C:\\Users\\lukej\\Desktop\\risk of rain 2 database\\RiskofRain2Database\\src\\main\\resources\\survivordataformated.txt");
        try {
            x = new Scanner(text); 
            while(x.hasNext()){
         String name = x.nextLine();
         String passive = x.nextLine();
         String unlock = x.nextLine();
         int armor = x.nextInt();
         int speed = x.nextInt();
         String health= x.nextLine();
         String healthregen = x.nextLine();
         String damage = x.nextLine();
         tempabil = new ArrayList<>();
         for(int i=0; i<4; i++){
               String abilityuse= x.nextLine();
               double cooldown = x.nextDouble();
               String abilityname= x.nextLine();
               String abilitydescrip= x.nextLine();
               Ability ab = new Ability(abilityname, abilityuse,cooldown , abilitydescrip);
               tempabil.add(ab);
            }
       //Survivor(String name, String pass, String unlock, int armor, int speed, String health, String healre, String damage, ArrayList<Ability>lo)
       Survivor s = new Survivor(name,passive,unlock,armor,speed,health,healthregen,damage,tempabil);
       alSurvivor.add(s);
            }
       
       
      //adding GameItem itm to the hashtable location given by the itm as well as the rarity of the itm
       //adding game item to an arraylist making it so that I can put into dlm easier
            x.close();
            
     } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //READ IN PLAYERS/ENEMIES
     public void itemstoJson(){
     //this will need the buffer then this will be the loop
         /*
        alGameItem.forEach(itm -> {
              
                    }); 
        */
     }
    }
   

