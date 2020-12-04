/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodicelukeendicott.riskofrain2database;

import java.util.Hashtable;

/**
 *
 * @author lukej
 */
public class RunLogEntry {
   private Enemy killedBy;
   private String time;
   private Boolean pf;
   private int stagesDone;
   private Hashtable<String,Integer> items;
   private Hashtable<String,Integer> enemies;
  RunLogEntry(String time, Boolean pf, int sd, Hashtable<String,Integer> itm, Hashtable<String,Integer> e, Enemy kb){
     this.time= time;
     this.pf = pf;
     this.stagesDone = sd;
     this.items = itm;
     this.enemies = e;
     this.killedBy = kb;
  }
}
