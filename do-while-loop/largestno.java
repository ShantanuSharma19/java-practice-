import java.util.Scanner;

public class largestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number; 
        int largest = Integer.MIN_VALUE;  
        // Start with the smallest possible integer so any user input will be larger.

        // Keep asking for numbers until user enters 0
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextInt();

            if (number != 0 && number > largest) {
                // Update largest only if the number is not 0 and greater than current largest
                largest = number;
            }

        } while (number != 0);  // loop stops when user enters 0

        if (largest == Integer.MIN_VALUE) {
            // If no valid numbers were entered before 0
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + largest);
        }

        sc.close();
    }
}
