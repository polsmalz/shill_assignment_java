import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[2][3];

        System.out.println("Enter values for the matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}