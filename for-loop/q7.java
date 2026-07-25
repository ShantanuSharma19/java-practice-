//Calculate and print the factorial of every number from 1 to n
import java.util.*;
public class q7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:-");
        int n=sc.nextInt();
        
        //Loop through numbers from 1 to n
        for (int i=1; i<=n; i++) {
            int fact=1;

            //Calculate factorial of i
            for(int j=1; j<=i; j++){
                fact=fact*j;
            }
            System.out.println("Factorial of " +i+ "=" + fact);
        }
    }
}