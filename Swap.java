import java.util.*;
class Swap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 'a' value:");
        int a=sc.nextInt();
        System.out.println("Enter 'b' value:");
        int b=sc.nextInt();
        a=a+b;// total val
        b=a-b;// removing b part from total val 'a'
        a=a-b; // removing a part from total value 'a'
        System.out.println("a value is:"+a);
        System.out.println("b value is:"+b);

    }
}