import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 22, 19};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int search = input.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Number found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array");
        }

        input.close();
    }
}