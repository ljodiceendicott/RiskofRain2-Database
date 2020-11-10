/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author lukej
 */
public class ReadinFile{
    private Scanner x;
    
    public void readFile() throws FileNotFoundException{
    File text= new File("\\..\\..\\..\\..\\..\\..\\FormatedROR2Data.txt");
       
    Scanner x = new Scanner(text);
    while(x.hasNext()){
       String itemType= x.next();
       String name= x.next();
       String pickupdesc= x.nextLine();
    }
        
    }
    
    }

