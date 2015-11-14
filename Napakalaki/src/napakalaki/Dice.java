/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.Random;

/**
 *
 * @author Carmen Biedma
 */
public class Dice {
    
    private static final Dice instance=new Dice();
    
    private Dice(){}
    
    public static Dice getInstance(){
        return instance;
    }
    
    public int nextNumber(){
        Random r = new Random();
        int n = r.nextInt(6)+1;
        return n;
    }
    
    
}
