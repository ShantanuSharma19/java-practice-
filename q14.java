public class q14 {
    public static void main (String args[]){
        int number = 345;
        int sum=0;
        int temp = number; // copy of the number
        while (temp != 0) {
            int digit = temp % 10; // get last digit
            sum += digit;          // add it to sum
            temp = temp / 10;      // remove last digit
        }
        System.out.println("Sum of digits in " + number + " = " + sum);
    }
}
