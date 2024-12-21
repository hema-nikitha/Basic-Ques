import java.util.*;
class Farhtocel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the far val");
        int y=sc.nextInt();
    
        int x=(y-32)*5/9;
        System.out.println(x);

    }
}