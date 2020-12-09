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
   private String survivorplayed;
   private String killedBy;
   private int time;
   private Boolean pf;
   private int stagesDone;
  String notes;
  RunLogEntry(int time, Boolean pf, int sd, String kb, String survplayed,String notes){
     this.time= time;
     this.pf = pf;
     this.stagesDone = sd;
     this.notes = notes;
     this.killedBy = kb;
     this.survivorplayed = survplayed;
  }
   @Override
  public String toString(){
      return "Time:("+this.time+") Played As:"+this.survivorplayed+" Stages Complete:"+this.stagesDone;
}
}