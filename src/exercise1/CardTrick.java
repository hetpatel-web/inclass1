package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Het Patel May 30, 202
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            // card.setValue(insert call to random number generator here)
            card.setValue(rand.nextInt(13));
            // card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[rand.nextInt(3)]);

        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.
        // Hint: You can ask for values 1 to 10, and then
        // 11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        // 1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        //
        // Then loop through the cards in the array to see if there's a match.

        // If the guess is successful, invoke the printInfo() method below.

        Scanner scanner = new Scanner(System.in);

        // Ask for card value
        System.out.print("Enter the card value (1-13): ");
        int userValue = scanner.nextInt();

        // Ask for card suit
        System.out.println("Enter the card suit:");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ". " + Card.SUITS[i]);
        }
        System.out.print("Choose the card suit (1-4): ");
        int userSuitInt = scanner.nextInt() - 1;
        String userSuit = Card.SUITS[userSuitInt];

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search for a match in the hand
        boolean matchFound = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == userCard.getValue() && hand[i].getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }

        // Check if a match was found
        if (matchFound) {
            System.out.println("Congratulations! Your card is in the hand.");
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }

    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     * 
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();

    }

}
