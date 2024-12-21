import java.util.*;
class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int y=sc.nextInt();
        int k=y;
        int d=String.valueOf(y).length();   // to return the length of num
        int s=0;
        while(y!=0){

    
        int r=y%10;                 // to return the last digit
        s=s+(int)Math.pow(r,d);     // type casted., apply power
        y=y/10;                       // remove the digit
        }
        if(s==k){
            System.out.println("It is armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }
        sc.close();

    }
}
