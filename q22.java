//Print the cube of each number from 1 to n.
public class q22 {
    public static void main(String[] args) {
        int n = 10; // change this value to test

        System.out.println("Cubes of numbers from 1 to " + n + ":"); // Print cubes of numbers from 1 to n

        int i = 1;
        while (i <= n) {
            System.out.print(i * i * i + " ");
            i++;
        }
    }  
}
