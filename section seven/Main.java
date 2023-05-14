import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");   

        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        System.out.println("This " + nissan.make + " is worth $" + nissan.price + 
        ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price + 
        ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");

        Person passenger = 
            new Person("Mike", "English", "February 23rd 1987", new String[3], 227 );

        System.out.println(passenger.name + " is " + passenger.nationality + ", date of birth is " + passenger.dateOfBirth
        + ". Passport details are " + (Arrays.toString(passenger.passport)) + " and is sitting in seat number " + passenger.seatNumber);
    }
}
