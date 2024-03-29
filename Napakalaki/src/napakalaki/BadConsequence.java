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
public class BadConsequence {
    
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    
    
    
    public BadConsequence(String txt,int lvls,int nvt,int nht){
        
        text=txt;
        levels=lvls;
        nVisibleTreasures=nvt;
        nHiddenTreasures=nht;
    }
    
    public BadConsequence(String txt,boolean dth){
        text=txt;
        death=dth;
    }
    
    public BadConsequence(String txt, int lvls, ArrayList<TreasureKind> tVisible,ArrayList<TreasureKind> tHidden){
        text=txt;
        levels=lvls;
        specificVisibleTreasures=tVisible;
        specificHiddenTreasures=tHidden;
    }
    
    public boolean isEmpty(){
         
        boolean empty = false;

        if (levels == 0 && death == false && nHiddenTreasures == 0 && nVisibleTreasures == 0 && specificHiddenTreasures.isEmpty() && specificVisibleTreasures.isEmpty()) {

            empty = true;
        }

        return empty;
    }
    
    public String getText(){
        return text;
    }
    
    public int getLevels(){
        return levels;
    }
    
    public int getNVsisibleTreasures(){
        return nVisibleTreasures;
    }
    
    public int getNHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public boolean getDeath(){
        return death;
    }
    
    public ArrayList<TreasureKind> getSpecificHiddenTreasures(){
        return specificHiddenTreasures;
    }
    
    public ArrayList<TreasureKind> getSpecificVisibleTreasures(){
        return specificVisibleTreasures;
    }
    
    public void substractVisibleTreasure(Treasure t){
        
    }
    
    public void  substractHiddenTreasure(Treasure t){
        
    }
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v,ArrayList<Treasure> h){
        return null;
    } 
    
    public String toString(){
        return "Mal rollo: = " + text + " ,niveles que pierde = " + Integer.toString(levels) + " ,num tesoros visibles que pierdes: " +  Integer.toString(nVisibleTreasures) + " ,num tesoros escondidos que pierdes: " + Integer.toString(nHiddenTreasures);
    }
}
    