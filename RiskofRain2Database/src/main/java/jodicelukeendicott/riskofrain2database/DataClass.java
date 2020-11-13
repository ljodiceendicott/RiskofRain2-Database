/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import java.io.FileNotFoundException;
import java.util.Hashtable;

/**
 *
 * @author lukej
 */
public class DataClass {
    //delete Class due to not neeeding I can put hashtable and call readfiles from another location
    public static Hashtable<String,GameItem> items;
    ReadFiles rf;
    
    public DataClass() throws FileNotFoundException{
        //creation of the hashtables that will hold the information
       
        items = new Hashtable<>();
        rf = new ReadFiles();
        
    }
    //items classes
    
    
}
