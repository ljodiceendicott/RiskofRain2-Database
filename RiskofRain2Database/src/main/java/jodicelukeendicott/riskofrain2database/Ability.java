/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

/**
 *
 * @author lukej
 */
public class Ability {
  private String name;
  private String loadoutSlot;
  private Double coolDown;
  private String Description;
   
   Ability(String name, String los, Double cd, String desc){
       this.name= name;
       this.loadoutSlot= los;
       this.Description= desc;
       this.coolDown = cd;
   }
   
   public String getName(){
       return name;
   } 
   public String getLoadoutSlot(){
       return loadoutSlot;
   }
   public String getDescrp(){
       return Description;
   }
   public Double getCD(){
       return coolDown;
   }
   
}
