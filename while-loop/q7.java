import java.util.Scanner;

class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to take input

        System.out.print("Enter a number: "); // Ask user for a number
        int n = sc.nextInt(); // Read the number entered by user

        int i = 1;   // Start from 1 (first odd number)
        int sum = 0; // Variable to store sum of odd numbers

        // Loop runs until i is less than or equal to n
        while (i <= n) {
            if (i % 2 != 0) { // Check if i is odd
                System.out.print(i + " "); // Print the odd number
                sum += i; // Add the odd number to sum
            }
            i++; // Move to the next number
        }

        // Print the final sum of odd numbers
        System.out.println("\nSum of odd numbers = " + sum);

        sc.close(); // Close the Scanner
    }
}
