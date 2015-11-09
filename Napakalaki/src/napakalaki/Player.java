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
        
    }
    
    private int getCombatLevel(){
        return 0;
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
        return 0;
        
    }
    
    private void dielfNoTreasures(){
        
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
        return false;
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
