/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Carmen Biedma
 */
public class Treasure {
    
    private String name;
    private int bonus;
    private TreasureKind type;
    
   public Treasure(String nombre, int b, TreasureKind t){
       name=nombre;
       bonus=b;
       type=t;
       
   }
   
   public String getName(){
       return name;
      
   }
   
   public int getBonus(){
       return bonus;
       
}
   
   public TreasureKind getType(){
        return type;
}
   
   
    
}
