import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        // Wait for the user to press enter.
        scan.nextLine();

        // Get two random cards.
        int playerCard1 = drawRandomCard();
        int playerCard2 = drawRandomCard();
        int playerTotal = 0;
        int dealerTotal = 0;

        System.out.println("\nYou get a\n" + cardString(playerCard1) + "\nand a \n" + cardString(playerCard2));

        // Print the sum of your hand value.
        playerTotal = Math.min(playerCard1, 10) + Math.min(playerCard2, 10);
        System.out.println("Your total is: " + (playerTotal));

        
        // Get two random cards for the dealer. Show one, keep the other hidden
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        // caclulate dealer score
        dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);

        System.out.println("The dealer shows \n" + cardString(dealerCard1) + "\nand has a card facing down\n" + faceDown());
        System.out.println("\n The dealer's total is hidden.");
       
        //  Keep asking the player to hit or stay (while loop).
        //      1. Every time the player hits, draw a new card and calculate new total. Show card
        //      2. Once the player stays, break the loop. +

        while (true) {
            String option = hitOrStay();

            if (option.equals("stay")) {        
                break; 
            }
            int newCard = drawRandomCard();
            playerTotal += Math.min(newCard, 10);
            System.out.println("\nYou get a\n" + cardString(newCard));
            System.out.println("Your new total is " + playerTotal);

              
            // if player score is over 21, end the game
            if (playerTotal > 21) {
                System.out.println("Bust! Player loses.");
                System.exit(0);
            }
        }   

            System.out.println("\nDealer's turn");
            System.out.println("\nThe dealer's cards are\n" + cardString(dealerCard1) + "\nand a\n" + cardString(dealerCard2));
            System.out.println("Dealer's total is " + dealerTotal);                    

        while (dealerTotal < 17) {
            int newCard = drawRandomCard();

            dealerTotal += Math.min(newCard, 10);
            System.out.println("\nDealer gets a\n" + cardString(newCard));
            System.out.println("\nDealer's total is\n" + dealerTotal);
            if (dealerTotal > 21) {
                System.out.println("Bust! Dealer loses");
                System.exit(0);
            }
        }

        if (playerTotal > dealerTotal) {
            System.out.println("Player wins!");
        } else { 
            System.out.println("Dealer wins!");
        }
        
        scan.close();
    }

    /**
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
        
        double randomNumber = (Math.random() * 13) + 1; // 1 - 13.999999
        int randomCard = (int) randomNumber;            // 1 - 13

        return randomCard;
    }

    /**
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber) {

        switch (cardNumber){
            case 1: return(
                "   _____\n"+
                "  |A _  |\n"+ 
                "  | ( ) |\n"+
                "  |(_'_)|\n"+
                "  |  |  |\n"+
                "  |____V|\n");

            case 2: return(
                "   _____\n"+              
                "  |2    |\n"+ 
                "  |  o  |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____Z|\n");

            case 3: return(
                "   _____\n" +
                "  |3    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____E|\n");
                
            case 4: return(
                "   _____\n" +
                "  |4    |\n"+
                "  | o o |\n"+
                "  |     |\n"+
                "  | o o |\n"+
                "  |____h|\n");

            case 5: return(
                "   _____ \n" +
                "  |5    |\n" +
                "  | o o |\n" +
                "  |  o  |\n" +
                "  | o o |\n" +
                "  |____S|\n");

            case 6: return (
                "   _____ \n" +
                "  |6    |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  |____6|\n");

            case 7: return(
                "   _____ \n" +
                "  |7    |\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |____7|\n");
       
            case 8: return(
                "   _____ \n" +
                "  |8    |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  |____8|\n");
          
            case 9: return (
                "   _____ \n" +
                "  |9    |\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |____9|\n");

            case 10: return(
                "   _____ \n" +
                "  |10  o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |___10|\n");
         
            case 11: return(
                "   _____\n" +
                "  |J  ww|\n"+ 
                "  | o {)|\n"+ 
                "  |o o% |\n"+ 
                "  | | % |\n"+ 
                "  |__%%[|\n");
         
            case 12: return(
                "   _____\n" +
                "  |Q  ww|\n"+ 
                "  | o {(|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%O|\n");
           
            case 13: return (
                "   _____\n" +
                "  |K  WW|\n"+ 
                "  | o {)|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%>|\n");
            
            default: return (" ");
        }
    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /**
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay(){

        System.out.println("Would you like to hit or stay?");
        String response = scan.nextLine();

        while (!(response.equalsIgnoreCase("hit") || response.equalsIgnoreCase("stay"))) {
            System.out.println("Please write 'hit' or 'stay'");
            response = scan.nextLine();
        }
        return response;
    }        
}