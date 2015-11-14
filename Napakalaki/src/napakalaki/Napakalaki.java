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
public class Napakalaki {
    
    private static final Napakalaki instance=new Napakalaki();
    private Monster currentMonster;
    private CardDealer dealer;
    private Player currentPlayer;
    private ArrayList<Player> players= new ArrayList();
    
    
    private Napakalaki(){}
    
    private void initPlayers(ArrayList<String> names){
        
    }
    
    private Player nextPlayer(){
        return null;
    } 
    
    private boolean nestTurnAllowed(){
        return false;
    }
    
    private void setEnemies(){
        
    }
    
    public static Napakalaki getInstance(){
        return instance;
    }
    
    public CombatResult developCombat(){
        return null;
    }
    
    public void discardVisibleTreasures(ArrayList<Treasure> treasures){
        
    }
    
    public void discardHiddenTreasures(ArrayList<Treasure> treasures){
        
    }   
    
    public void makeTreasuresVisible(ArrayList<Treasure> treasures){
        
    }
    
    public void initGame(ArrayList<String> players){
        
    }
    
    public Player getCurrentPlayer(){
        return null;
    }
    
    public Monster getCurrentMonster(){
        return null;
        
    }
    
    public boolean nextTurn(){
        return false;
    }
    
    public boolean endOfGame(CombatResult result){
        return false;
    }
          
    
}
