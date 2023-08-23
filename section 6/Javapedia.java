import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        
        //       – Ask the user: how many historical figures will you register?
        //       – Store the value.
        System.out.println("How many historical figures will you register?");
        int input = scan.nextInt();
        
        // Create a 2D array with a variable number of rows, and 3 values per row.  
        String[][] database = new String[input][3];   
        scan.nextLine();

        /*
            create a for loop that:
            - picks up and stores figure's name.  
            - picks up and stores figure's birthday.
            - picks up and stores figure's occupation.         
        */
        for (int i = 0; i < input; i++) {
            System.out.println("\n\tFigure " + (i+1));

            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();

            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();

            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.println("\n");
        }
        System.out.println("These are the values you stored:"); 
        //call print2DArray.
        print2DArray(database); 

        System.out.print("\nWho do you want information on? ");  
        
        /*  search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */      
        String name = scan.nextLine();
        for (int i = 0; i < input; i++) {
            if (database[i][0].contains(name)) {
                System.out.println("Name: " + database[i][0]);
                System.out.println("Date of birth: " + database[i][1]);
                System.out.println("Occupation: " + database[i][2]);
            }
        }        

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}