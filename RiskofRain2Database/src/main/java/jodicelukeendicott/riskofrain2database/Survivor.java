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
public class Survivor {
    private String name;
    private String passive;
    private String unlocking;
    private String armor;
    private String speed;
    private String health;
    private String healthregen;
    private String damage;
    private ArrayList<Ability> loadout;
    
    Survivor(String name, String pass, String unlock, String armor, String speed, String health, String healre, String damage, ArrayList<Ability>lo){
        this.name= name;
        this.passive = pass;
        this.unlocking = unlock;
        this.armor = armor;
        this.speed = speed;
        this.health = health;
        this.healthregen = healre;
        this.damage= damage;
        loadout = new ArrayList<>();
        this.loadout = lo;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

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
    public String getArmor() {
        return armor;
    }

    /**
     * @return the speed
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * @return the health
     */
    public String getHealth() {
        return health;
    }

    /**
     * @return the healthregen
     */
    public String getHealthregen() {
        return healthregen;
    }

    /**
     * @return the damage
     */
    public String getDamage() {
        return damage;
    }

   public Ability getAbility(int idx){
       return loadout.get(idx);
   }
    
}
