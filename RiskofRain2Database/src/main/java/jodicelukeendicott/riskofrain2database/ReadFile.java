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

/**
 *
 * @author lukej
 */
public class ReadFile{
    private Scanner x;
    
    public static void readItemFile() throws FileNotFoundException{
    File text= new File("\\..\\..\\..\\..\\..\\..\\FormatedROR2Data.txt");
       
    Scanner x = new Scanner(text);
    while(x.hasNext()){
       String itemType= x.next();
       String name= x.next();
       String pickupdesc= x.nextLine();
       String effect= x.nextLine();
       ArrayList<Double>stat = new ArrayList<>();
       for(int i = 0; i<12; i++){
          Double num = x.nextDouble();
          stat.add(num);
       }
       //initialize new Gameitem
       //String rarity, String name, String pickuptext, String effect, ArrayList<Double> stack
       GameItem itm = new GameItem(itemType, name, pickupdesc,effect,stat);
     //  items.put(itm.rarity,itm);
       
    }
        
    }
    public void readEntityFile() throws FileNotFoundException{
        
    }
    //READ IN PLAYERS/ENEMIES
    
    }

