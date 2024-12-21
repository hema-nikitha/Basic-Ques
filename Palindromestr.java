import java.util.*;
class Palindromestr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a str");
        String n=sc.nextLine();                   // User's str
        String p=n.toLowerCase();     
        String h=new StringBuilder(p).reverse().toString();  // reversing .. funs .reverse(), .toString()
        
        if(p.equals(h)){                                       // comparing
            System.out.println("It is palindrome");   

        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}