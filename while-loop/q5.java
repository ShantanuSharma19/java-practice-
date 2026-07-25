
// Print the multiplication table of a given number from n × 1 to n × 10

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int i = 1;                          // STEP 1: Start
        while(i <= 10) {                    // STEP 2: Check
            System.out.println(n + " x " + i + " = " + (n * i)); // STEP 3: Work
            i++;                            // STEP 4: Increase
        }
    }
}

























/* 
import java.util.Scanner;
 public class q5{
      public static void main(String[] args) {
   Scanner sc= new Scanner (System.in);
    System.out.print("Enter a number : ");
   int n=sc.nextInt();
      System.out.print("Table_of" + n + ":");  //Just prints a heading/title so the user knows what table is being shown
    System.out.println("---------------------------"); ;  //Works like an underline under the heading
for (int i=1; i<=10; i++){
System.out.println(n + " * " + i + "="+(n*i));
  }
sc.close();
  
     }
}  
/* */