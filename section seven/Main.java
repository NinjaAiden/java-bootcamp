import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");   

        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

        Person passenger = 
            new Person("Mike", "English", "February 23rd 1987", new String[3], 227 );

        System.out.println(passenger.getName() + " is " + passenger.getNationality() + ", date of birth is " + 
            passenger.getDateOfBirth() + ". Passport details are " + (Arrays.toString(passenger.getPassport())) + 
            " and is sitting in seat number " + passenger.getSeatNumber());
    }
}
