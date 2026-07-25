import java.util.Scanner;

public class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // take input from user

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();                  

        int first = 0, second = 1, sum = 0;    // initialize variables

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");     // print current term
            sum += first;                      // add to sum

            int next = first + second;         // calculate next term
            first = second;
            second = next;
        }

        System.out.println("\nSum of Fibonacci series = " + sum);

        sc.close();                            // close scanner
    }
}

