import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter 3 numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less than 1. Shutting game down");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Numbers cannot be more than 6. Shutting game down");
            System.exit(0);
        } 

        int sumOfNumbers = num1+num2+num3;
        int sumOfDiceRolls = roll1+roll2+roll3;
        System.out.println("Dice sum = " + sumOfDiceRolls + ". Number sum = " + sumOfNumbers);
        
        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);     

        if (checkWin(sumOfDiceRolls, sumOfNumbers)) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry! You lose");
        }
        
        scan.close();
    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }

    public static boolean checkWin(int sumOfDiceRolls, int sumOfNumbers){
        return (sumOfNumbers > sumOfDiceRolls && sumOfNumbers - sumOfDiceRolls < 3);
    }    
}
