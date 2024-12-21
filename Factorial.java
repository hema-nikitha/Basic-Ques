import java.util.*;
class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        int p=sc.nextInt();
        int f=1;
        for(int i=p;i>0;i--){   // range  ., let p=5  ., 5,4,3,2,1
            
            f=f*i;              //1*5., 5*4; 20*3; 60*2; 120*1


        }
        System.out.println(p + "!="+ f);  // concatenation
        
}
}