/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Carmen Biedma
 */
public class Player {
    
    static final int MAXLEVEL=10;
    private String name;
    private int level;
    private boolean dead;
    private boolean canSteal;
    private  Player enemy;
    private ArrayList<Treasure> visibleTreasures= new ArrayList();
    private BadConsequence pendingBadConsequence;
    private ArrayList<Treasure> hiddenTreasures=new ArrayList();
    
    
    public Player(String nombre){
        name=nombre;
        dead=true; 
        canSteal=true;
    }
    
    public String getName(){
        return name;
    }
    
    private void bringToLife(){
        dead=false;
    }
    
    private int getCombatLevel(){
        int v=0,h=0,nivel_total=0;
        for(int i=0;i<visibleTreasures.size();i++){
            v=v+visibleTreasures.get(i).getBonus();
            h=h+hiddenTreasures.get(i).getBonus();
        }
        
        nivel_total=level+v+h;
        return nivel_total;
        
    }
    
    private void incrementLevels(int i){
        
    }
    
    private void decrementLevels(int i){
        
    }
    
    private void setPendingBadConsequence(BadConsequence b){
        pendingBadConsequence=b;
    }
    
    private void applyPrize(Monster m){
        
    }
    
    private void applyBadConsequence(Monster m){
        
    }
    
    private boolean canMakeTreasureVisible(Treasure t){
        return false;
        
    }
    
    private int howManyVisibleTreasures(TreasureKind tKind){
        int vtt=0;
        
        for(int i=0;i<visibleTreasures.size();i++){
            if(visibleTreasures.get(i).getType()==tKind)    
                vtt++;
        }
        
        return vtt;
        
    }
    
    private void dielfNoTreasures(){
        
        if(visibleTreasures.size()==0 && hiddenTreasures.size()==0)
            dead=true;
        
    }
    
    public boolean isDead(){
        return dead;
    }
    
    public ArrayList<Treasure> getHiddenTreasures(){
        return hiddenTreasures;
    }
    
    public ArrayList<Treasure> getVisibleTreasures(){
        return visibleTreasures;
    }
    
    public CombatResult combat(Monster m){
        return null;
    }
    
    public void makeTreasureVisible(Treasure t){
    }
    
    public void discardVisibleTreasure(Treasure t){
        
    }
    
    public void discardHiddenTreasure(Treasure t){
        
    }
    
    public boolean validState(){
        boolean state=false;
        
        if(pendingBadConsequence.isEmpty() && hiddenTreasures.size()<=4 )
               state=true;
        
        return state;
    }
    
    public void initTreasures(){
        
    }
    
    public int getLevels(){
        return level;
    }
    
    public Treasure stealTreasure(){
        return null;
    }
    
    public void setEnemy(Player enem){
        enemy=enem;
        
    }
    
    private Treasure giveMeATreasure(){
        return null;
    }
    
    public boolean canSteal(){
        return false;
    }
    
    private boolean canYouGiveMeATreasure(){
        return false;
    }
    
    private void haveStolen(){
        
    }
    
    public void discardAllTreasures(){
        
    }
    
        
}
