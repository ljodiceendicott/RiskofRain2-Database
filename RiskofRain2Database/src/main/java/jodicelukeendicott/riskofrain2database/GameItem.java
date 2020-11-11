/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author lukej
 */
public class GameItem {
    String rarity;
    String name;
    String pickuptext;
    String effect;
    ArrayList<Double> stack;
    Icon img;
    
    GameItem(String rarity, String name, String pickuptext, String effect, ArrayList<Double> stack){
       this.rarity = rarity;
       this.name = name;
       this.pickuptext = pickuptext;
       this.effect = effect;
       this.stack = stack;
       //Icon
    }
    
}
