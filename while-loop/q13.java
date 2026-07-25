//q13-Check whether the given number is a palindrome. 


public class q13 {
    public static void main(String args[]){
        int number = 12321;   // The number we want to check
        int reversed = 0;     // Variable to store the reversed number
        int temp = number;    // Copy of the original number (so we don’t lose it)

        // Reverse the number using a while loop
        while (temp != 0) {
            int digit = temp % 10;             // Extract the last digit (e.g., 12321 % 10 = 1)
            reversed = reversed * 10 + digit;  // Append digit to reversed (e.g., 0*10+1 = 1)
            temp = temp / 10;                  // Remove the last digit (e.g., 12321 / 10 = 1232)
        }

        // Compare original number with reversed number
        if (number == reversed) {
            System.out.println(number + " is a palindrome.");  // If equal → palindrome
        } else {
            System.out.println(number + " is not a palindrome."); // If not equal → not palindrome
    }
  }
}