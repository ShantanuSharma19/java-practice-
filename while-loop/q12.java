//q-12 Reverse the given number and print the reversed value

public class q12 {
    public static void main (String args[]){
       int number = 12345;   // you can change this number
        int reversed = 0;

        int temp = number; // copy of the number

        // Reverse logic using while loop
        while (temp != 0) {
            int digit = temp % 10;          // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            temp = temp / 10;               // remove last digit
        }

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
    }
}

    
//int reversed = 0 → starting point to build the reversed number.

//int temp = number → a working copy so the original number remains intact