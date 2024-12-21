import java.util.*;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range ");
        int num=sc.nextInt();
        
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<=num;i++){
            System.out.println(a); // a=0 ,1 ,1 ,2
            c=a+b;   // c=0+1 ., 1., c=1 , b=1 ., c=1+1=2 ., c=2 ., c=1+2=3., c=3
            a=b;     // a=1  ,a=1  ,a=2
            b=c;     // b=1  , b=2 ,b=3
            

        }
        sc.close();
        


    }
}