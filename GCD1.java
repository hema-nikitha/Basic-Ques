
import java.util.*;


class GCD1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a%b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        System.out.println("GCD:"+b);
        sc.close();
        
    }
}