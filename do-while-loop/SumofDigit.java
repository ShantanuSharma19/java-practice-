import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;   // To store sum of digits
        int temp = num; // Copy of number for processing

        // Use do-while loop to extract digits and add them
        do {
            int digit = temp % 10;   // Get last digit
            sum = sum + digit;       // Add digit to sum
            temp = temp / 10;        // Remove last digit
        } while (temp > 0);

        // Print result
        System.out.println("Sum of digits of " + num + " = " + sum);

        sc.close();
    }
}
