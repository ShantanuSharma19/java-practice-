import java.util.Scanner;

public class CountPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;   // To keep track of positive numbers
        int num;         // Variable to store user input

        // Use do-while loop to keep reading numbers
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if (num >= 0) {     // If number is non-negative
                count++;        // Increment positive count
            }
        } while (num >= 0);     // Continue until a negative number is entered

        // Print result
        System.out.println("Total positive numbers entered = " + count);

        sc.close();
    }
}
