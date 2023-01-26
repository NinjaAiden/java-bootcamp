import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

        int secretNumber = (int) (Math.random() * 5) + 1;

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
        Scanner scan = new Scanner(System.in);

        int userGuess = scan.nextInt();     // wait for user input

        while (userGuess != secretNumber){
            System.out.print("Nope! Try again: ");  // if incorrect, prompt for another try
            userGuess = scan.nextInt();
       }

       System.out.println("Well done! You got the number!");    // When correct. Print win message
            
        scan.close();
    }

}
