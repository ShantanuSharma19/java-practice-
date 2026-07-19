public class hcf {
    public static void main(String[] args) {
        int a = 12 ;   // First number (you can change this)
        int b = 18 ;   // First number (you can change this)
        int hcf = 1 ;  // Variable to store HCF
        int i = 1 ;    //counter variable

                // Use do-while loop to check all possible divisors
        do {
            if (a % i == 0 && b % i == 0) {   // If i divides both a and b
                hcf = i;                      // Update hcf
            }
            i++;                              // Increment counter
        } while (i <= Math.min(a, b));        // Loop until i reaches smaller of a and b

        // Print result
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
    }
}
