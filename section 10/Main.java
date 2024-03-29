import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Store store = new Store();

    public static void main(String[] args) { 
        
        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
        Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);

        MagazineLibrary library = new MagazineLibrary();
        
        // Test the addMagazine method
        library.addMagazine(magazine1);
        library.addMagazine(magazine2);

        // Test the getMagazine method
        Magazine retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());

        // Test the setMagazine method
        Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
        library.setMagazine(0, newMagazine);

        // Verify that the magazine was updated
        retrievedMagazine = library.getMagazine(0);
        System.out.println(retrievedMagazine.getTitle());

        // try {
        //     loadMovies("movies.txt");
        //     printStore();
        //     userInput();
        // } catch (FileNotFoundException e) {
        //     System.out.println(e.getMessage());
        // }

    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";
    
        while (status.equals("continue")) {
            int choice = (promptForChoice(scanner));
            Movie movie = store.getMovie(choice);
            double rating = promptForRating(scanner, movie.getName());
    
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();
    }

    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");

            // 1. Anticipate the user not entering an integer.
            if (!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();

            // 2. Anticipate the choice being incorrect.
            if (incorrectChoice(choice))    continue;
            return choice;
        }
    }

    public static boolean incorrectChoice(int choice) {
        if (choice < 0 || choice > 9){
            return true;
        }
        return false;
    }

    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
            
            // 1. Anticipate the user not entering a double.
            if (!scanner.hasNextDouble()){
                scanner.next();
                continue;
            }
            double rating = scanner.nextDouble();
            
            // 2. Anticipate the rating being incorrect.
            if (incorrectRating(rating))    continue;
            return rating;
         }
    }

    public static boolean incorrectRating(double rating) {
        if (rating < 0 || rating > 10){
            return true;
        }
        return false;
    }

    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split("--");
            store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }
        scanFile.close();
   }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
