public class q16 {
    public static void main(String[] args) {
        int number = 28;   // you can change this number
        int sum = 0;

        // Find divisors and add them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {   // check if i is a divisor
                sum += i;            // add divisor to sum
            }
        }

        // Check if sum equals the number
        if (sum == number) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }
    }
}


//perfect number: A perfect number is a positive integer that is equal to the sum of its proper positive divisors, excluding the number itself. For example, 6 is a perfect number because its divisors are 1, 2, and 3, and 1 + 2 + 3 = 6. Another example is 28, which has divisors 1, 2, 4, 7, and 14, and their sum is also 28.
//example: 6 is a perfect number because 1 + 2 + 3 = 6
//example: 12 is not a perfect number because 1 + 2 + 3 + 4 + 6 = 16 which is not equal to 12