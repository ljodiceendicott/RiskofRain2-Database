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
  private String coolDown;
  private String Description;
   
   Ability(String name, String los, String cd, String desc){
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
   public String getCD(){
       return coolDown;
   }
   public String printAbility(){
       return "Ability Type:"+this.getLoadoutSlot()+"\n Ability Name:"+this.getName()+"\n Cooldown:"+this.getCD()+"\n Description:"+this.getDescrp()+"\n";
   }
}
