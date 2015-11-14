/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Carmen Biedma
 */
public class CardDealer {
    
    private static  final CardDealer instance=new CardDealer();
    private ArrayList<Treasure> usedTreasures = new ArrayList();
    private ArrayList<Treasure> unusedTreasures = new ArrayList();
    private ArrayList<Monster> usedMonsters = new ArrayList();
    private ArrayList<Monster> unusedMonsters = new ArrayList();
    
    
    private CardDealer(){}
    
    private void initTreasureCardDeck(){
         unusedTreasures = new ArrayList();
         usedTreasures = new ArrayList(); 


        unusedTreasures.add(new Treasure("¡Śı mi amo!", 4, TreasureKind.helmet));
        unusedTreasures.add(new Treasure("Botas de investigación", 3,TreasureKind.shoes));
        unusedTreasures.add(new Treasure("Capucha de Cthulhu", 3,TreasureKind.helmet));
        unusedTreasures.add(new Treasure("A prueba de babas",2,TreasureKind.armor));
        unusedTreasures.add(new Treasure("Botas de lluvia ácida",1, TreasureKind.bothhand));
        unusedTreasures.add(new Treasure("Casco minero",2,TreasureKind.helmet));
        unusedTreasures.add(new Treasure("Ametralladora Thompson",4, TreasureKind.bothhand));
        unusedTreasures.add(new Treasure("Camiseta de la UGR",1,TreasureKind.armor));
        unusedTreasures.add(new Treasure("Clavo de rail ferroviario",3,TreasureKind.onehand));
        unusedTreasures.add(new Treasure("Cuchillo de sushi arcano",2,TreasureKind.onehand));
        unusedTreasures.add(new Treasure("Fez alópodo",3,TreasureKind.helmet));
        unusedTreasures.add(new Treasure("Hacha prehistórica",2, TreasureKind.onehand));
        unusedTreasures.add(new Treasure("El aparato del Pr. Tesla",4, TreasureKind.armor));
        unusedTreasures.add(new Treasure("Gaita",4, TreasureKind.bothhand));
        unusedTreasures.add(new Treasure("Insecticida",2,TreasureKind.onehand));
        unusedTreasures.add(new Treasure("Escopeta de 3 cañones",4,TreasureKind.bothhand));
        unusedTreasures.add(new Treasure("Garabato Mistico",2, TreasureKind.onehand)); 
        unusedTreasures.add(new Treasure("La rebeca metálica",2,TreasureKind.armor));
        unusedTreasures.add(new Treasure("Lanzallamas",4,TreasureKind.bothhand));
        unusedTreasures.add(new Treasure("Necro-comicón",1, TreasureKind.onehand));
        unusedTreasures.add(new Treasure("Necronomicón", 5, TreasureKind.bothhand));      
        unusedTreasures.add(new Treasure("Linterna a 2 manos",3,TreasureKind.bothhand));
        unusedTreasures.add(new Treasure("Necro-gnomicón",2,TreasureKind.onehand));
        unusedTreasures.add(new Treasure("Necrotelecom", 2, TreasureKind.helmet));
        unusedTreasures.add(new Treasure("Mazo de los antiguos",3,TreasureKind.onehand));
        unusedTreasures.add(new Treasure("Necro-playboycon",3, TreasureKind.onehand));      
        unusedTreasures.add(new Treasure("Porra preternatural",2, TreasureKind.onehand));
        unusedTreasures.add(new Treasure("Shogulador",1,TreasureKind.bothhand));
        unusedTreasures.add(new Treasure("Varita de atizamiento",3,TreasureKind.onehand));
        unusedTreasures.add(new Treasure("Tentáculo de pega", 2, TreasureKind.helmet));
        unusedTreasures.add(new Treasure("Zapato deja-amigos",1, TreasureKind.shoes));
        
        
        
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
