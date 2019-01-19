/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoker;

/**
 *
 * @author jackson
 */
public class Javapoker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      for (int i=0; i<20000; i++)
    {
        Deck deck= new Deck();
        Hand hand= new Hand(deck);
        Hand hand2= new Hand(deck);
        hand.display();
        hand.displayAll();
        hand2.display();
        hand2.displayAll();
        System.out.println(hand.compareTo(hand2));

    }
    }
    
}
