//Print the Fibonacci series up to the required number of terms. 
import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 2: Ask user for number of terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();  // Read integer input

        // Step 3: Initialize first two terms of Fibonacci series
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        // Step 4: Loop to print Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // Print current term

            // Calculate next term
            int next = first + second;
            first = second;
            second = next;
        }

        
        sc.close();
    }
}
