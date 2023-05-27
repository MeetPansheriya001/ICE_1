/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    // Modifier : Meet Pansheriya
    // Student number : 991700047
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generateRandomNumber());
            c.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int userValue = scanner.nextInt();

        System.out.print("Enter the suit of your card (0-3): ");
        int userSuit = scanner.nextInt();

        // and search magicHand here
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (userCard.equals(magicHand[i])) {
                found = true;
                break;
            }
        }
        //Then report the result here
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
    }
    
    // Generate a random number between 1 and 13 (inclusive)
    private static int generateRandomNumber() {
        return (int) (Math.random() * 13) + 1;
    }

    // Generate a random number between min and max (inclusive)
    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
        
        // lucky card :- 2 of Hearts
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Hearts");
    }
}
