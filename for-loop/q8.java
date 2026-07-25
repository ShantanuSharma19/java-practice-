//Q-Print all prime numbers between 1 and 100
public class q8 {
    public static void main(String[] args) {
       
    System.out.println("Prime number between 1 and 100  are:");

    //outer Loop through number from 2 to 100
    for(int num=2; num <=100; num++){
        boolean isPrime=true;

    //inner loop to Check divisiblity
    for (int i=2; i<=num/2; i++) {
        if (num % i == 0){ //if divisible is not prime 
            isPrime=false;
            break; //Not prime,exit inner loop 
        } 
    } 
    // print if prime
    if (isPrime){
        System.out.print(num + " ");
    }

    }

    }
}
