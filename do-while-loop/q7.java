public class q7 {
    public static void main(String args[]){
        int number=222; // you can change the value
        int original=number; //store the original number
        int reversed=0;
        int temp=number;

        //Reverse number logic using do-while loop--
        do { 
            int digit= temp % 10; //extract last digit
            reversed =reversed * 10 + digit; //build reversed number
            temp= temp / 10;  //remove the last digit
        } while (temp != 0);

        //compare original and reversed logic--
         if (original == reversed){
            System.out.println(original + " is a Palindrome ");
         }else{
            System.out.println(original + " is NOT a Palindrome. ");
         }

    }
}
