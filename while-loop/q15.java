public class q15 {
    public static void main(String[] args) {
        int number = 153;   // you can change this number
        int sum = 0;
        int temp = number;

        // Count digits
        int digits = 0;
        int copy = number;
        while (copy != 0) {
            copy = copy / 10;
            digits++;
        }

        // Calculate sum of digits raised to the power of digits
        while (temp != 0) {
            int digit = temp % 10;                 // extract last digit
            sum += Math.pow(digit, digits);        // add digit^digits to sum
            temp = temp / 10;                      // remove last digit
        }

        // Check Armstrong condition
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

//An Armstrong number (also called a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits
//example: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153
//not an Armstrong number: 123 is not an Armstrong number because 1^3 + 2^3 + 3^3 = 36 which is not equal to 123