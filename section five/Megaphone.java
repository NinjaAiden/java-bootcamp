import java.util.Scanner;

public class Megaphone {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // prompt and take input from user
        System.out.println("Hi Bart. I can write lines for you");
        System.out.println("What would you like me to write?");
        String lines = scan.nextLine();

        // print input 99 times
        for (int i=1; i<=99; i++){
            System.out.println(i + ". " + lines);
        }

        //close scanner
        scan.close();
    }    
}
