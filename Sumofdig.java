import java.util.*;
class Sumofdig{
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the num");
        int num=sc.nextInt();
        int s=0;
        while(num!=0){
            
            int r=num%10;   // return th elast dig
            s=s+r;           // make the sum
            num/=10;          // remove the last dig
        }
        System.out.println(s);


        }
        
    }
