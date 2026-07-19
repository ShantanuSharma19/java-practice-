public class Fibonacci {
    public static void main(String[] args) {
        int terms= 10; // Number of terms to print (you can change this)
        int first=0;   // First term of Fibonacci series
        int second =1;  // Second term of Fibonacci series
        int count=1;   //counter variable

        //print the first two terms:
        System.out.print("Fibonacci Series up to " + terms + " terms : ");
        System.out.print(first+ " " + second + " ");

          // Use do-while loop to generate remaining terms
        do {
            int next =first+ second; // Next term = sum of previous two
            System.out.print(next +" "); // Print next term
            first = second;  // Update first
            second=next;     // Update second
            count++;         // Increment counter
            
        } while (count <= terms -2); // // Already printed 2 terms, so loop runs for (terms - 2)
    }
}


