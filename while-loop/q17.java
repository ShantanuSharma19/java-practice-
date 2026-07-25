public class q17 {
    public static void main(String[] args) {
        int number = 2;  // start from 2, since 1 is not prime

        System.out.println("Prime numbers between 1 and 100 are:");

        // Outer while loop to go through numbers from 2 to 100
        while (number <= 100) {
            boolean isPrime = true;   // assume number is prime

            int i = 2;  // divisor starts from 2
            // Inner while loop to check divisibility
            while (i <= number / 2) {
                if (number % i == 0) {
                    isPrime = false;  // not prime if divisible
                    break;
                }
                i++;
            }

            // Print if prime
            if (isPrime) {
                System.out.print(number + " ");
            }

            number++;  // move to next number
        }
    }
}
