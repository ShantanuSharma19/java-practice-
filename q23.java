//Print all numbers between a and b that are divisible by 7

public class q23 {
    public static void main(String[] args) {
        int a = 1; // starting number
        int b = 100; // ending number

        System.out.println("Numbers between " + a + " and " + b + " that are divisible by 7:");

        int i = a; 
        while (i <= b) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    
}
