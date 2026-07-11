//Q-10. Find and print the product of all digits of a given number

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number:- ");
        int n = sc.nextInt();
        int product = 1;

        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            product *= digit;   // Multiply it into the running product
            n /= 10;            // Remove the last digit
        }

        System.out.println(product);

        sc.close();
    }
}