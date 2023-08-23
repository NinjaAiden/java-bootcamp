import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
    
        System.out.println("Welcome to the Java Grocers.");
        System.out.println("What can I help you find?");
        String request = scan.nextLine();

        for(int i = 0; i < aisles.length; i++){
            // search for specific element and return index position
            if (aisles[i].equals(request)) {
                System.out.println("\nWe have that in aisle: " + i);
            }
        }
        
        scan.close();
    }
}
