public class q5 {
    public static void main(String args[]) {
        int number = 2341;
        int count = 0; // // Variable to store digit count
        int temp = number;

        if (temp == 0) { //// Special case: if the number is 0, it has exactly 1 digit
            count = 1;
        } else { // Use do-while loop to count digits
            // Loop runs at least once, even if number is small
            do {
                temp = temp / 10; // remove last digit
                count++; // increase digit count
            } while (temp != 0); // continue until no become 0
        }
        System.out.println("Number of digits in " + number + " is :" + count);
    }
}
