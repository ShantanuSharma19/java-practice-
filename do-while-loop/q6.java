public class q6 {
    public static void main(String args[]){
        int number=23456;
        int reversed =0; //Variable to store the reversed number
        int temp=number; //temp create to store the original value thats store on number

//Reverse using do-while loop
   do{
    int digit =temp % 10; //Extract the last digit of temp
    reversed = reversed * 10 + digit;  // Add the digit to reversed (shift existing digits left by multiplying by 10)
    temp = temp / 10; // remove the last digit from temp

   }while(temp !=0); //check until all given number will check or processed

   // Output result
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
    }
}
