public class q20 {
    public static void main(String[] args) {
        int n = 10;  // number of terms
        int first = 0, second = 1;
        int sum = 0;

        System.out.println("Fibonacci series up to " + n + " terms:");

        int count = 1;
        while (count <= n) {
            System.out.print(first + " ");   // print current term
            sum += first;                    // add current term to sum

            int next = first + second;       // calculate next term
            first = second;                  // shift values
            second = next;

            count++;
        }

        System.out.println("\nSum of Fibonacci series up to " + n + " terms = " + sum);
    }
}
