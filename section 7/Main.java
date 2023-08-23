import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        
        Dealership dealership = new Dealership(cars);
        

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");        
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 - 4).\n");
        int index = scan.nextInt();

        dealership.sell(index);

        scan.close();

        Person passenger = 
            new Person("Mike", "English", "February 23rd 1987", 0);


        System.out.println("\nName: " + passenger.getName() + "\n" + 
        "Nationality: " + passenger.getNationality() + "\n" + 
        "Date of Birth: " + passenger.getDateOfBirth() + "\n" +
        "Seat Number: " + passenger.getSeatNumber());

        if (passenger.applyPassport()){
            passenger.setPassport();
            System.out.println("Passport: " +
            Arrays.toString(passenger.getPassport())); 
        }else {
            System.out.println("Passport: " +
            Arrays.toString(passenger.getPassport())); 
        }

        System.out.println("\nTest case \n" + passenger);

    }
}