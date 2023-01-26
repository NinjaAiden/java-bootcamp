public class HighScore {
    public static void main(String[] args) {      

        // get 10 random numbers and save to the array
        int scores[] = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), 
                    randomNumber(), randomNumber(), randomNumber()};

        int highScore = 0;     
        int seat = 0;   

        System.out.print("Here are the scores: ");

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {        // check if element in array is higher than highscore variable
                highScore = scores[i];          // update highscore
            }
            if (scores[i] == highScore){
                seat = i;    
            }
            System.out.print(scores[i] + " ");  // print scores
        }

        
        System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");        
        System.out.println("It's the man in seat: " + seat + ". Give that man a cookie!");
    }

    /**
     * Function name - randomNumber
     * @return (int)
     * 
     * inside the function
     *      - returns a random number between 0 to 49,999 
     */
    public static int randomNumber() {
        
        double randomNumber = Math.random() * 50000; // 0 - 49999
        int randomInt = (int) randomNumber;

        return randomInt;
    }

}
