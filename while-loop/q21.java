//Print the square of each number from 1 to n.

public class q21 {
    public static void main(String[] args) {
        int n = 10; // change this value to test

        System.out.println("Squares of numbers from 1 to " + n + ":"); // Print squares of numbers from 1 to n

        int i = 1;
        while (i <= n) {
            System.out.print(i * i + " ");
            i++;
        }
    }
}
