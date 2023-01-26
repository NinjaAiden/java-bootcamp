public class RandomNumbers {
    public static void main(String[] args) {

        // create new array with 100 rows and 10 elements in each row
        int[][] array = new int[100][10];

        // populate the array with random numbers by calling the randomNumber() function
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = randomNumber();
            }
        }

        // print array by calling the print function
        print2DArray(array);        
    }

    // generates a random number between 1 - 100
    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }

    /**
     *  Function name - print2DArray
     *  @param array (int[][])
     * 
     *  Inside the function:
     *      1. Nested loop:
     *          - Inner loop: system.out.print(array[i][j] + " ")
     *          - After inner loop completes move to new line
     */
    public static int[][] print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        return array;
    }

}
