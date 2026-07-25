//Print all even numbers between 1 and 100

public class q3 {
    public static void main(String[] args) {
        int i = 2; // start at the first even number
        while (i <= 100) { // condition: keep going until 100
            System.out.print(i + " "); // print the number
            i += 2; // increment by 2 to stay even
        }
    }
}




/////.... other approach to solve 


 /*      public class EvenNumbers {
    public static void main(String[] args) {
        int i = 1;  // start from 1

        while (i <= 100) {   // loop until 100
            if (i % 2 == 0) {   // condition for even number
                System.out.print(i + " ");
            }
            i++;  // move to next number
        }
    }
}
 */