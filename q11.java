//11Q- Count and print the total number of digits in a given number. 

public class q11 {
    public static void main(String[] args) {
        int number = 12345;  // you can change this number
        int count = 0;

        int temp = number; // copy of the number

        // Count digits using while loop
        while (temp != 0) {
            temp = temp / 10;  // remove last digit
            count++;           // increase count
        }

        System.out.println("Total digits in " + number + " = " + count);
    }
}
    
