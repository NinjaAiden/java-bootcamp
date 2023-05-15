import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");   

        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        nissan.setColor("Jet Black");
        dodge.setPrice(dodge.getPrice() / 2);

        Car nissan2 = new Car(nissan);

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        Person passenger = 
            new Person("Mike", "English", "February 23rd 1987", new String[3], 227 );

        Person passenger2 = new Person(passenger);

        passenger2.setName("Lewis");
        passenger2.setSeatNumber(226);

        System.out.println(passenger.getName() + " is " + passenger.getNationality() + ", date of birth is " + 
            passenger.getDateOfBirth() + " and is sitting in seat number " + passenger.getSeatNumber());

        System.out.println(passenger2.getName() + " is " + passenger2.getNationality() + ", date of birth is " + 
            passenger2.getDateOfBirth() + " and is sitting in seat number " + passenger2.getSeatNumber());
    }
}
