import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
        
    System.out.println("\nLet's play tic tac toe");

    // Create an array with three rows of '_' characters.
    char[][]  gameBoard = {
      { '_', '_', '_'},
      { '_', '_', '_'},
      { '_', '_', '_'},
    };

    // Call the function printBoard();
    printBoard(gameBoard);
             
    //Loop through turns.   
    for(int i = 0; i < 9; i++) {
      if(i % 2 == 0) {
        System.out.println("X's turn");
        int[] spot = askUser(gameBoard);
        gameBoard[spot[0]][spot[1]] = 'X';
        printBoard(gameBoard);
        int count = checkWin(gameBoard);
        if (count == 3) {
          System.out.println("X wins!");
          break;
        }
      } else {
        System.out.println("O's turn");
        int[] spot = askUser(gameBoard);
        gameBoard[spot[0]][spot[1]] = 'O';
        printBoard(gameBoard);
        int count = checkWin(gameBoard);
        if (count == -3) {
          System.out.println("X wins!");
          break;
        }
      }
    }

    // if no one wins, print tie message
    System.out.println("It's a tie!");

    scan.close();
  }


  /**
  * Function name - printBoard()
  * @param board (char[][])
  * 
  * Inside the function:
  *   1. print a new line.
  *   2. print the board.
  *      • separate each row by two lines. 
  *      • each row precedes a tab of space
  *      • each character in the grid has one space from the other character
  */  
  public static void printBoard(char[][] board) {
    System.out.print("\n");
    for(int i = 0; i < board.length; i++) {
      System.out.print("\t");

      for(int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println("\n");
    }
  }      

  /** 
  * Function name – askUser
  * @param board (char[][] board)
  * @return spot (int[])
  * 
  * Inside the function
  *   1. Asks the user: - pick a row and column number: 
  *   2. Check if the spot is taken. If so, let the user choose again.
  *   3. Return the row and column in an int[] array. 
  */
  public static int[] askUser(char[][] board) {
    System.out.print("Pick a row and column number: ");
    int row = scan.nextInt();
    int column = scan.nextInt();

    while (board[row][column] == 'X' || board[row][column] == 'O') {
      System.out.print("Spot taken, please choose again: ");
      row = scan.nextInt();
      column = scan.nextInt();
    }   

    return new int[] {row, column};
  }


  /** Task 6 - Write a function that determines the winner
  * Function name - checkWin 
  * @param board (char[][])
  * @return count (int)
  * 
  * Inside the function:
  *   1. Make a count variable that starts at 0.
  *   2. Check every row for a straight X or straight O
  *   3. Check every column for a straight X or straight O
  *   4. Check the left diagonal for a straight X or straight O (Task 9).
  *   5. Check the right diagonal for a straight X or straight O (Task 10).
  */
  public static int checkWin(char[][] board) {
    int count = 0;

    // check for straight row win
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'X') {
          count++;
        } else if (board[i][j] == 'O'){
          count--;
        }
      }

      if (count == 3 || count == -3) {
        return count;
      } else {
        count = 0;
      }
    }

     //check for straight column win
     for (int i = 0; i < 3; i++) {
      count = 0;
      for (int j = 0; j < board.length; j++) {
        if (board[j][i] == 'X') {
          count++;
        } else if (board[j][i] == 'O'){
          count--;
        }        
      }

      if (count == 3) {
        return count;
      } else if (count == -3) {
        return count;
      }
    }

    // check for left diagonal win
    if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
      System.out.println("X wins");
      System.exit(0);
    } else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
      System.out.println("O wins");
      System.exit(0);
    }

    // check for right diagonal win
    if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
      System.out.println("X wins");
      System.exit(0);
    } else if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') {
      System.out.println("O wins");
      System.exit(0);
    }

    return count;
  }
}