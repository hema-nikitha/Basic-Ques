// To check if user's i/p num is palindrome or not
import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner d=new Scanner (System.in);
        System.out.println("Enter the num =" );
        int l=d.nextInt();    // User's entered val
        int u=l;  // copy the val in other var
        int rev=0;    
        while(l!=0){


        
        int rem=l%10;   // to return last digit ., eg: 123 >> 3 is returned  .,  2 is returned  ., 1 is returned
        
        rev=rev*10+rem;      // storing last digit( reversal )   >> 3 is stored  ., 32 is stored ., 321 is stored
        l=l/10;         // to remove last digit    >> 3 is removed ., 2 is removed  ., 1 is removed
        }
        
        if(rev==u){
            System.out.println("It is palindrome");

        }
        else{
            System.out.println("Not a palindrome");
        }
        

    }
}
