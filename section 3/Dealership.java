import java.util.Scanner;

public class Dealership {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership");
        System.out.println(" . Select option A to buy a car");
        System.out.println(" . Select option B to sell a car");
        String option = scan.nextLine();

        switch (option){
            case "a": 
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000){       //ten thousand
                    System.out.println("Great! A Nissan Altima is available for " + budget);
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    scan.nextLine();  
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 660){
                        System.out.println("Sold! Pleasure doing business with you");
                        } else {
                            System.out.println("We're sorry. You are not eligible");
                        }
                    } else {
                        System.out.println("We don't sell cars under $10,000. Sorry!");
                    }
                break;

            case "b":
                    System.out.println("\nWhat is your car valued at?");
                    int value = scan.nextInt();
                    System.out.println("\nWhat is your selling price?");
                    int price = scan.nextInt();
                    if (value > price && price < 30000){    //thirty thousand
                        System.out.println("\nWe will buy your car. Pleasure doing business with you");
                    } else {
                        System.out.println("\nSorry. We're not interested!");
                    }
                 break;
            default: System.out.println("Invalid option");
        }

        scan.close();
    }
    
}
