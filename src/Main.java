import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {



        System.out.println("Welcome to the treasure hunt game!");

        System.out.print("Enter column size: ");
        int columnSize = Integer.parseInt(stdin.nextLine());

        System.out.print("Enter row size: ");
        int rowSize = Integer.parseInt(stdin.nextLine());
        int[][] array = new int[columnSize][rowSize];

        // setting the random variable
        Random random = new Random();
        int randomColumn = random.nextInt(columnSize);
        int randomRow = random.nextInt(rowSize);

        // Assigning the selected cell to 1:
        array[randomColumn][randomRow] = 1;






        // iterating over the rows and column
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }
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