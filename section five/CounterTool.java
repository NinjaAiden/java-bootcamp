import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        // get user input
        System.out.print("1. Pick a number to count by: ");
        int count = scan.nextInt();         // increase number by this per step
        System.out.print("2. Pick a number to start counting from: ");
        int startNumber = scan.nextInt();   // number to start from
        System.out.print("3. Pick a number to count to: ");
        int lastNumber = scan.nextInt();    // number to end on

        for (int i = startNumber; i <= lastNumber; i += count){
            System.out.print(i + " ");      // don't forget the space!
        }

        scan.close();
    }
}
