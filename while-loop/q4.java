//Print all odd numbers between 1 and 100.

public class q4 {
    public static void main(String [] args){
        int i=1;  //start from 1

        while (i <=100){  //loop until 100
            if (i%2 !=0){ // condition to check if the number is odd
                System.out.print(i + " "); // print the odd number
            }
            i++; // increment the number
        }
    }
    
    
}



                  //...............or other approach ..........
/* 
public class q4 {
    public static void main(String[] args) {
        int i = 1; // start at the first odd number
        while (i <= 100) { // condition: keep going until 100
            System.out.print(i + " "); // print the number
            i += 2; // increment by 2 to stay odd
        }
    }
}
*/