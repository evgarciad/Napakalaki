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
    
    public String getText(){
        return text;
    }
    
    public int getLevels(){
        return levels;
    }
    
    public int getNVT(){
        return nVisibleTreasures;
    }
    
    public int getNHT(){
        return nHiddenTreasures;
    }
    
    public boolean getDeath(){
        return death;
    }
    
    public String toString(){
        return "Mal rollo: = " + text + " ,niveles que pierde = " + Integer.toString(levels) + " ,num tesoros visibles que pierdes: " +  Integer.toString(nVisibleTreasures) + " ,num tesoros escondidos que pierdes: " + Integer.toString(nHiddenTreasures);
    }
}
    