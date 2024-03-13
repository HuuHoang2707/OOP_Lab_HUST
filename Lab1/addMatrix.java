import java.util.Scanner;

public class addMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the first matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int columns = scanner.nextInt();
 
        int[][] arr = new int[rows][columns];

        System.out.println("Enter the elements of the array of the first matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
 
        int[][] arr2 = new int[rows][columns];

        System.out.println("Enter the elements of the array of the second matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                arr2[i][j] = scanner.nextInt();
            }
        }

        int[][] Sum_arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Sum_arr[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        System.out.println("The Sum of Two Array is: ");

         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Sum_arr[i][j] + " ");
            }
            System.out.println(); 
        }

        

    }
}