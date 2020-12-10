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
public class Enemy extends Entity{
    private String size;
    private String info1;
    private String info2;
    private String fact;
        Enemy(String size,String name,String health, String healthregen,String damage, String speed, String armor, String info1, String info2, String fact){
            super(name,health,healthregen,damage,speed,armor);
            this.size = size;
            this.info1 = info1;
            this.info2 = info2;
            this.fact = fact;
        }
        public String printInfo(){
            return "Size:"+this.getSize()+"\n"+super.getInfo()+"Info #1:"+this.getInfo1()+"\nInfo#2:"+this.getInfo2()+"\nFact:"+this.getFact()+"\n";
        }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @return the info1
     */
    public String getInfo1() {
        return info1;
    }

    /**
     * @return the info2
     */
    public String getInfo2() {
        return info2;
    }

    /**
     * @return the fact
     */
    public String getFact() {
        return fact;
    }
    
       }
