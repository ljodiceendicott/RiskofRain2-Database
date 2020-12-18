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
   private Boolean beatGame;
   private int stagesDone;
  private String notes;
  private String runName;
  RunLogEntry(int time, Boolean pf, int sd, String kb, String survplayed,String notes, String runName){
     this.time= time;
     this.beatGame = pf;
     this.stagesDone = sd;
     this.notes = notes;
     this.killedBy = kb;
     this.survivorplayed = survplayed;
     this.runName= runName;
  }
  public String printInfo(){
      return "Time:"+this.getTime()+"\n Character Played:"+this.getSurvivorplayed()+"\n Stages Complete:"+this.getStagesDone()+"\n Notes From Run:"+this.getNotes()+"\n";
  }
   @Override
  public String toString(){
      return this.runName+"  Time:"+this.time+" Minutes";
}
  public String getName(){
      return runName;
  }
  public boolean getBeatGame(){
      return this.beatGame;
  }
    /**
     * @return the survivorplayed
     */
    public String getSurvivorplayed() {
        return survivorplayed;
    }

    /**
     * @return the killedBy
     */
    public String getKilledBy() {
        return killedBy;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @return the stagesDone
     */
    public int getStagesDone() {
        return stagesDone;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }
}