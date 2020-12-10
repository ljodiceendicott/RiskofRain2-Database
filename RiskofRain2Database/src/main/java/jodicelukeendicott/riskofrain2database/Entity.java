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
public class Entity {
    private String name;
    private String health;
    private String healthregen;
    private String damage;
    private String speed;
    private String armor;
    Entity(String name, String health,String healthregen, String damage, String speed, String armor){
        this.name = name;
        this.health = health;
        this.healthregen = healthregen;
        this.damage=damage;
        this.speed = speed;
        this.armor = armor;
        
    }
    public String getInfo(){
        return "Name:"+this.getName()+"\n Health:"+this.getHealth()+"\n Health Regeneration Speed:"+this.getHealthregen()+"\n Damage:"+this.getDamage()+"\n Speed:"+this.getSpeed()+"Armor:"+this.getArmor()+"\n";
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the health-regen
     */
    public String getHealthregen() {
        return healthregen;
    }

    public String getHealth() {
        return health;
    }
    /**
     * @return the damage
     */
    public String getDamage() {
        return damage;
    }

    /**
     * @return the speed
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * @return the armor
     */
    public String getArmor() {
        return armor;
    }
    @Override
    public String toString(){
        return name;
    } 
}
