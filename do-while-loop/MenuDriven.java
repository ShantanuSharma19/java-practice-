import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n=== MENU ===");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Print Fibonacci Series");
            System.out.println("3. Find HCF of two numbers");
            System.out.println("4. Check Armstrong Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Factorial
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    int fact = 1, i = 1;
                    do {
                        fact *= i;
                        i++;
                    } while (i <= num);
                    System.out.println("Factorial of " + num + " = " + fact);
                    break;

                case 2: // Fibonacci
                    System.out.print("Enter number of terms: ");
                    int terms = sc.nextInt();
                    int first = 0, second = 1, count = 1;
                    System.out.print("Fibonacci Series: " + first + " " + second + " ");
                    do {
                        int next = first + second;
                        System.out.print(next + " ");
                        first = second;
                        second = next;
                        count++;
                    } while (count <= terms - 2);
                    System.out.println();
                    break;

                case 3: // HCF
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    int hcf = 1, j = 1;
                    do {
                        if (a % j == 0 && b % j == 0) {
                            hcf = j;
                        }
                        j++;
                    } while (j <= Math.min(a, b));
                    System.out.println("HCF of " + a + " and " + b + " = " + hcf);
                    break;

                case 4: // Armstrong
                    System.out.print("Enter a number: ");
                    int arm = sc.nextInt();
                    int original = arm, sum = 0, digits = 0, temp = arm;
                    while (temp != 0) {
                        digits++;
                        temp /= 10;
                    }
                    temp = arm;
                    do {
                        int digit = temp % 10;
                        sum += Math.pow(digit, digits);
                        temp /= 10;
                    } while (temp != 0);
                    if (sum == original)
                        System.out.println(original + " is an Armstrong number.");
                    else
                        System.out.println(original + " is NOT an Armstrong number.");
                    break;

                case 5: // Exit
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5); // Repeat until user chooses Exit

        sc.close();
    }
}
