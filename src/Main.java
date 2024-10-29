import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to the treasure hunt game!");

        // Setting row and column sizes
        int columnSize = 5;
        int rowSize = 3;
        int[][] array = new int[columnSize][rowSize];

        // setting the random variable
        Random random = new Random();
        int randomColumn = random.nextInt(columnSize);
        int randomRow = random.nextInt(rowSize);

        // Assigning the selected cell to 1:
        array[randomColumn][randomRow] = 1;
        // new line
        System.out.print("\n");
        // Asking user to guess the column and row sizes
        System.out.print("Please guess column size: ");
        int guessColumnSize = stdin.nextInt();

        System.out.print("Please guess row size: ");
        int guessRowSize = stdin.nextInt();

        // Logic for the program

        if (randomColumn == guessColumnSize && randomRow == guessRowSize) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you lost!");
        }

        // assigning the value to each row and column
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


    }
}