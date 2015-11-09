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
public class CardDealer {
    
    static private CardDealer instance;
    private ArrayList<TreasureKind> usedTreasures = new ArrayList();
    private ArrayList<TreasureKind> unusedTreasures = new ArrayList();
    private ArrayList<TreasureKind> usedMonsters = new ArrayList();
    private ArrayList<TreasureKind> unusedMonsters = new ArrayList();
    
    
    private CardDealer(){
        instance=null;
    }
    
    private void initTreasureCardDeck(){
        
    }
    
    private void initMonsterCardDeck(){
    
    }
    
    private void shuffleTreasures(){
        
    }
    
    private void shuffleMonsters(){
        
    }
    
    public static CardDealer getInstance(){
        return instance;
    }
    
    public Treasure nextTreasure(){
        return null;
    }
    
    public Monster nextMonster(){
        return null;
    }
    
    public void giveTreasureBack(Treasure t){
        
    }
    
    public void giveMonsterBack(Monster m){
        
    }
    
    public void initCards(){
        
    }
       
        
    
}
