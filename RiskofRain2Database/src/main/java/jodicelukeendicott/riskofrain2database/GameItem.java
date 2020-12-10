/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author lukej
 */
public class GameItem {
    private String rarity;
    private String name;
    private String pickuptext;
    private String effect;
    ArrayList<Double> stack;
   // String imageloc;
    //ImageIcon img;
    GameItem(String rarity, String name, String pickuptext, String effect, ArrayList<Double> stack){
       this.rarity = rarity;
       this.name = name;
       this.pickuptext = pickuptext;
       this.effect = effect;
       this.stack = stack;
      // this.imageloc = "/../../../pictures/items/"+this.rarity+"/"+this.name+".png";
       //this.img = new javax.swing.ImageIcon(getClass().getResource(this.imageloc));
       //Icon
    }
    GameItem(String rarity, String name, String pickuptext, String effect){
       this.rarity = rarity;
       this.name = name;
       this.pickuptext = pickuptext;
       this.effect = effect;
    }
   // public ImageIcon getIcon(){
     //   return img;
  //  }
    public String printInfo(){
        return "Rarity:"+this.getRarity()+"\n Name:"+this.getName()+"\n Pickup Text:"+this.getPickuptext()+"\n Effect:"+this.getEffect()+"How item Stacks:"+this.printstack();
    }

    /**
     * @return the rarity
     */
    public String getRarity() {
        return rarity;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the pickuptext
     */
    public String getPickuptext() {
        return pickuptext;
    }

    /**
     * @return the effect
     */
    public String getEffect() {
        return effect;
    }
    @Override 
    public String toString(){
        return this.getName();
    }
    public String printstack(){
        String stacknum = "";
        for(int i =0; i>stack.size(); i++){
            stacknum = stacknum+ "Item Amount:"+i+"Stat Effect:"+stack.get(i)+"\n";
        }
        return stacknum;
    }
    public double getstack(int i){
        return stack.get(i); 
    }
    
}
