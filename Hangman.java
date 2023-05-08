import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {
    "+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"
    };

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // initialise counter for incorrect guesses
        int wrongGuessCount = 0;
        
        String word = getWord();             // get word by calling getWord()
        char[] hiddenWord = hideWord(word);  // create new hidden word array
        char[] missedGuesses = new char[6];  // create array for missed guesses. Max wrong guesses is 6
        
        // call printGameScreen
        printGameScreen(hiddenWord, wrongGuessCount, missedGuesses);

        while (wrongGuessCount < 6){

            char playerGuess = scan.next().charAt(0);
            if(checkGuess(playerGuess, word)){
                updatePlaceholders(playerGuess, hiddenWord, word);
            } else {
                missedGuesses[wrongGuessCount] = playerGuess;
                wrongGuessCount++;
            }

            //update game screen
            printGameScreen(hiddenWord, wrongGuessCount, missedGuesses);

            checkWin(hiddenWord, word);

            if (wrongGuessCount >= 6){

                String revealedWord = new String(word);

                System.out.println("\nThe man was hanged, bad luck");
                System.out.println("the word was " + revealedWord); 
            }                              
        }            
        scan.close();
    }

    /**
     *  Function name - getWord
     *  @return word (String)
     * 
     *  Inside the function:
     *      1. Get random word from list of words
     *      2. pass word from a String to a char array and return
     */
    public static String getWord(){

        // get random word from list
        String word = words[(int)(Math.random() * words.length)];

        return word;
    }

    /**
     * function name - hideWord 
     * @param word (String)
     * @return hiddenWord (char[])
     * 
     * inside the function:
     *  1. create new char array, same length as the String word
     *  2. change all letters to '_' to create placeholders
     */
    public static char[] hideWord(String word){

        char[] hiddenWord = new char[word.length()];

        for (int i = 0; i < word.length(); i++){
            hiddenWord[i] = word.charAt(i);
        }
   
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '_';
        }   
        return hiddenWord;
    }

    /**
     * Function name - printGameScreen
     *  @param hiddenWord (char[])
     *  @param wrongGuessCount int
     *  @param missedGuesses (char[])
     * 
     *  Inside the function:
     *      1. print gallows (use wrongGuessCount to access correct stage)
     *      2. print placeholders
     *      3. print missed guesses
     *      4. print prompt for next guess
     */
    public static void printGameScreen(char[] hiddenWord, int wrongGuessCount, char[] missedGuesses) {        

        System.out.println("\n" + gallows[wrongGuessCount]);

        System.out.print("Word: " + new String(hiddenWord));

        System.out.println("\n\nMisses: " + new String(missedGuesses));

        System.out.print("\nGuess: ");
    }

   /**
    * Function name - checkGuess
    * @param playerGuess char
    * @param word String
    *
    * Inside the function:
    *   1. if player has guessed a correct letter return true
    *   2. if player guess does not match any letters, return false
    */
    public static boolean checkGuess(char playerGuess, String word){

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == playerGuess) {
                return true;                               
            }
        } return false;
    }

    /**
     * function name - updatePlaceholders
     * @param playerGuess
     * @param hiddenWord
     * @param word
     */
    public static void updatePlaceholders(char playerGuess, char[] hiddenWord, String word){
        for(int j = 0; j < word.length(); j++){
            if (word.charAt(j) == playerGuess){
                hiddenWord[j] = playerGuess;
            }
        }        
    }

    /**
     * Function name - checkWin
     * @param hiddenWord char[]
     * @param word char[]
     * 
     * Inside the function:
     *      1. convert the char arrays into strings for easier comparison
     *      2. check the two strings are the same
     *      3. If the strings are the same, print win message and exit
     */
    public static void checkWin(char[] hiddenWord, String word){

        String hiddenWordString = new String(hiddenWord);

        if (hiddenWordString.equals(word)){
            System.out.println("Congratulations! You win!");
            System.exit(0);
        }
    }
}