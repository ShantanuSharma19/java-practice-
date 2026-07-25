//Q-9. Write a program to calculate the factorial of a number using a while loop.

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Read the number whose factorial is to be calculated
        System.out.print("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();

        // Initialize factorial to 1 (0! and 1! are both 1)
        long factorial = 1;

        // Counter variable for the while loop
        int i = 1;

        // Multiply factorial by each integer from 1 to n
        while (i <= n) {
            factorial *= i; // Same as: factorial = factorial * i
            i++;            // Move to the next number
        }

        // Display the computed factorial
        System.out.println(factorial);

        // Close the Scanner to free resources
        sc.close();
    }
}