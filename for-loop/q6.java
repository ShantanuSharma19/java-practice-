//Calculate and print the factorial of a given number.
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a number :- ");
        int n =sc.nextInt();

        long fact=1; // use long to handle larger results
        
        for (int i=1; i <=n; i++){
            fact=fact*i;
        }
System.out.println("Factorial of  " +n+ " = " + fact);
        
    }
}
