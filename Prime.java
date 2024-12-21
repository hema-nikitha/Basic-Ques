import java.util.*;
class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("not a prime"); //  constraint :: user's entered num : 0 or 1 or lesser

        }
        boolean isPrime=true;    // Assume my n is prime 
        for(int i=2;i<=Math.sqrt(n);i++){   // let n=36., range of factors ; 2 to 6   // n=64 ., factors 2 to 8
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
            if(isPrime){
                System.out.println("It is a prime");

            }
            else{
                System.out.println("Not a prime");

        
            }
        }
    }
