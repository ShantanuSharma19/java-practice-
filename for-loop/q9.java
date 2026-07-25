//  Check whether the given number is a prime number.
import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a number:-");
        int num=sc.nextInt();
        boolean isPrime=true;

        //// Step to check  Prime numbers are greater than 1
        if(num < 2){
            isPrime =false;
        }else{
            //step to check divisblity from 2 up to num/2
              for(int i=2; i <=num/2; i++){
                if (num % i ==0){ //check if divisible not prime
                     isPrime=false;
                     break;
                }
              }
        }
         // Print result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
       sc.close();

       {

        }
    }
}
