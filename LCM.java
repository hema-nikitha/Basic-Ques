import java.util.*;
class LCM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a%b!=0){
            int r=a%b;     // product of 2 nums=GCD*LCM
            a=b;
            b=r;
        }
        int result=b;
        
    
    int product=a*b;
    int lcm=product/result;
    System.out.println("Lcm:"+lcm);

}
}