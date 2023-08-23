import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) {
        
        Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
        Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");
        Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03");
        Contact contact4 = new Contact("David", "456-789-0123", "1996-04-04");       

        Movie[] movies = new Movie[] {

            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
            
        };   

        // populate the store object (defined on top) with movies before printing it
        for (int i = 0; i < movies.length; i++){
            store.setMovie(i, movies[i]);
        }

        printStore();
        userInput();        
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";

        System.out.println("\nPlease choose a number between 0 - 9: ");
        // grab next int
        int movieChoice = scanner.nextInt();
        // reference class and create local variable
        Movie movie = store.getMovie(movieChoice);

        System.out.println("Set a new rating for " + movie.getName() + ": ");
        // get next double
        double movieRating = scanner.nextDouble();
        // change rating using local variable as reference
        movie.setRating(movieRating);

        store.setMovie(movieChoice, movie);
        printStore();

        while (status.equals("continue")) {
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static void printStore(){
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);  // toString override in Store class changes this to something easier to read
    }    
}
