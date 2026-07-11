//Calculate and print the sum of the first n natural numbers. 

import java.util.Scanner;

class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // prompt user
        int n = sc.nextInt();  // read user input

        int i = 1; // start from 1
        int sum = 0; // accumulator for the sum

        while (i <= n) { // loop until i reaches n
            sum += i;  // add current i to sum
            i++;      // move to next number
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}




/* explataion of the code:

int i = 1;
int sum = 0;

🍎 Line 1: int i = 1;
-Think of i as the apple number you’re picking.

-You start with apple number 1.

-Later, you’ll move to apple number 2, then 3, and so on.

-So i is like your counter: it tells you which apple you’re holding right now.

🍏 Line 2: int sum = 0;
-Think of sum as your basket.

-At the beginning, the basket is empty (0).

-Each time you pick an apple (i), you drop it into the basket by adding its number.

-The basket keeps track of the total apples collected so far.
/* */