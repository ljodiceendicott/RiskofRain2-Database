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
    String name;
    String passive;
    String unlocking;
    int armor;
    int speed;
    String health;
    String healthregen;
    String damage;
    ArrayList<Ability> loadout;
    
    Survivor(String name, String pass, String unlock, int armor, int speed, String health, String healre, String damage, ArrayList<Ability>lo){
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
}
