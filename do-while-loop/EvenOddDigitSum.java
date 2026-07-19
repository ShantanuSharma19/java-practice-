import java.util.Scanner;

public class EvenOddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Keep a copy of the original number for printing later
        int original = number;

        // Make the number positive, in case user enters a negative number
        number = Math.abs(number);

        int evenSum = 0;  // stores sum of even digits
        int oddSum = 0;   // stores sum of odd digits
        int digit;        // stores each digit we extract

        // do-while runs at least once, so it works even if number is 0
        do {
            digit = number % 10;   // get the last digit
            
            if (digit % 2 == 0) {
                evenSum += digit;  // add to even sum if digit is even
            } else {
                oddSum += digit;   // add to odd sum if digit is odd
            }

            number = number / 10;  // remove the last digit

        } while (number != 0);     // repeat until no digits are left

        System.out.println("Original number: " + original);
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);

        sc.close();
    }
}