/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import java.util.ArrayList;

/**
 *
 * @author lukej
 */
public class Survivor extends Entity{
    private String passive;
    private String unlocking;
    private ArrayList<Ability> loadout;
    
    Survivor(String name, String pass, String unlock, String armor, String speed, String health, String healre, String damage, ArrayList<Ability>lo){
        super(name,health,healre,damage,speed,armor);
        this.passive = pass;
        this.unlocking = unlock;
        loadout = new ArrayList<>();
        this.loadout = lo;
    }
    public String printInfo(){
        return super.getInfo()+"How you Unlock Survivor:"+this.getUnlocking()+"\n Passive:"+this.getPassive()+"loadout:"+this.printAbilities();
    }
    @Override
    public String toString() {
        return this.getName();
    }

    /**
     * @return the name
     */
  

    /**
     * @return the passive
     */
    public String getPassive() {
        return passive;
    }

    /**
     * @return the unlocking
     */
    public String getUnlocking() {
        return unlocking;
    }

    /**
     * @return the armor
     */

    /**
     * @return the speed
     */
   public String printAbilities(){
       String abilities = "";
       for(int i= 0; i > this.loadout.size(); i++){
           abilities = abilities + loadout.get(i).printAbility();
       }
       return "";
   }
   public Ability getAbility(int idx){
       return loadout.get(idx);
   }
    
}
