/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nupur Bhavsar
 * Student Id - 991659793
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        generator.setSeed(System.currentTimeMillis());
        System.out.println("The cards in the magic hand are: ");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             c.setValue(generator.nextInt(13) + 1);
            c.setSuit(Card.SUITS[generator.nextInt(4)]);
            magicHand[i] = c;
            System.out.println(c);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        System.out.print("Enter card value: ");
        int val = sc.nextInt();
        System.out.print("Enter suit: ");
        String suit = sc.next();
        Card key = new Card();
        key.setValue(val);
        key.setSuit(suit); 
        
        
       
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
         if (!found)
            System.out.println("Card is not found in magic hand.");
    }
    
}
