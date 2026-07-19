public class Armstrong_no {
    public static void main(String args[]){
        int number =153;
        int original = number;
        int sum = 0; // // Will hold the sum of each digit raised to the power of total digits
          // Step 1: Count digits in the number
        int digits = 0;
        int temp = number;
        while (temp != 0) {     // Use while loop to count digits
            digits++;
            temp = temp / 10;
        }

        // Step 2: Reset temp for calculation
        temp = number;

        // Step 3: Use do-while loop to calculate sum of digit^digits
        do {
            int digit = temp % 10;                  // Extract last digit
            sum += Math.pow(digit, digits);         // Add digit^digits to sum
            temp = temp / 10;                       // Remove last digit
        } while (temp != 0);                        // Continue until all digits processed

        // Step 4: Compare sum with original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
        
    }
}
