import java.util.*;
class Sumofnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int t=sc.nextInt();
        int s=0;
        for(int i=0;i<=t;i++){
            s=s+i;
           
        }
        System.out.println(s);

    }
}