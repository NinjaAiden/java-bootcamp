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

    public static String[] gallows = {"+---+\n" +
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

        int guessCount = 0;
        
        // get word by calling getWord()
        char[] word = getWord();

        // call printGameScreen
        printGameScreen(word, guessCount);

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

    public static void printGameScreen(char[] word, int guesses) {        

        //print starting gallows
        System.out.println(gallows[guesses]);

        //hide word
        System.out.print("Word: ");
        for (int i = 0; i < word.length; i++) {
            System.out.print("_ ");
        }   

        System.out.println("\n\nMisses: ");

        System.out.println("\nGuess: ");
    }
}