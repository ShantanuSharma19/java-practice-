import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   

        System.out.print("Enter a number: ");
        int num = sc.nextInt();               

        System.out.println("Factors of " + num + " are:");

        // loop from 1 to num to check divisibility
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {                // if divisible, i is a factor
                System.out.print(i + " ");
            }
        }

        sc.close();                            // close scanner
    }
}

