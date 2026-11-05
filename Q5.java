import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] marks = new int[3][3];

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = input.nextInt();
            }
        }

        // Output
        System.out.println("\nMarks Table:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}