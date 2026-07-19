public class factorial {
    public static void main(String[] args) {
        int num = 5;            // Number to find factorial of (you can change this)
        int factorial = 1;      // Variable to store the result
        int i = 1;              // Counter variable

        // Calculate factorial using do-while loop
        do {
            factorial = factorial * i;   // Multiply current factorial by i
            i++;                         // Increment counter
        } while (i <= num);              // Continue until i exceeds num

        // Print result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
