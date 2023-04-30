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
    " =========\n"};

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // initialise counter for incorrect guesses
        int wrongGuessCount = 0;
        
        char[] word = getWord();                    // get word by calling getWord()
        char[] hiddenWord = new char[word.length];  // create new hidden word array
        char[] missedGuesses = new char[6];         // create array for missed guesses. Max wrong turns is 6
        
        //hide word
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '_';
        }   

        // call printGameScreen
        printGameScreen(hiddenWord, wrongGuessCount, missedGuesses);

        while (wrongGuessCount <= 6){

            char playerGuess = scan.next().charAt(0);
            for (int i = 0; i < word.length; i++){
                if (word[i] == playerGuess) {
                    hiddenWord[i] = playerGuess;
                } else {
                    missedGuesses[wrongGuessCount] = playerGuess;
                }
            }

            printGameScreen(hiddenWord, wrongGuessCount, missedGuesses);

            checkWin(hiddenWord, word);

        }

        

        scan.close();
    }

    /**
     *  Function name - getWord
     *  @return word (char[])
     * 
     *  Inside the function:
     *      1. Get random word from list of words
     *      2. pass word from a String to a char array and return
     */
   public static char[] getWord(){

    // get random word from list
    String randomWord = words[(int)(Math.random() * words.length)];

    // pass randomWord string to a char array
    char word[] = new char[randomWord.length()];
    for (int i = 0; i < randomWord.length(); i++) {
        word[i] = randomWord.charAt(i);
    }

    return word;
   }

    /**
     * Function name - printGameScreen
     *  @param word (char[])
     *  @param int guesses
     * 
     *  Inside the function:
     *      1. print gallows (use guessCount to access correct stage)
     *      2. hide word and print empty spaces
     *      3. print missed guesses
     *      4. Prompt for next guess
     */

    public static void printGameScreen(char[] hiddenWord, int wrongGuessCount, char[] wrongLetters) {        

        //print gallows
        System.out.println("\n" + gallows[wrongGuessCount]);

        System.out.print("Word: " + new String(hiddenWord));

        System.out.println("\n\nMisses: " + new String(wrongLetters));

        System.out.print("\nGuess: ");
    }

    public static void checkWin(char[] hiddenWord, char[] word){

        String hiddenWordString = new String(hiddenWord);
        String wordString = new String(word);

        if (hiddenWordString.equals(wordString)){
            System.out.println("Congratulations! You win!");
            System.exit(0);
        }
    }
}