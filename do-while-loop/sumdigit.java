import java.util.*;

public class sumdigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :-");
        int number = sc.nextInt();   // first input (not really needed, but initializes 'number')

        int sum = 0;  // variable to keep track of the running total

        // loop keeps asking for numbers until user enters 0
        do { 
            System.out.println("Enter a number (0 to stop): ");
            number = sc.nextInt();   // take next input -- the new input value overwrites the old one stored in that variable.
            sum += number;           // add input to total
        } while (number != 0);       // stop when user enters 0

        // after loop ends, print the total sum
        System.out.println("The sum of all entered numbers is: " + sum);

        sc.close();  // close scanner
    }
}
