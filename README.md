1) Armstrong number: Here we input 1 number , which can be of any no.of digited, if we do the power of each digit with equal to its length of the num., the resulted num should be equal to the input num..To find the power of each digit of a number , we have to access each digit, there are various processes to access each digit of a num .,.. 1) We have to  convert the number into string., i.e let int y , the that value is stored in other var, let int k=y, Convert the int num into String, int p=String.valueOf(y), Finding the length of the num(String) for calculating power of each digit , int p=String.valueOf(y).length()  // int l=p.length() , Create other var so all the processes is done through it let int s=0..constraint while(y!=0)... To acess each and every char of the String num there are 2 processes ., 1) Create a for loop i.e., for(char p:y.toCharArray()) // We'll find the reminder for accessing the each digit of a num , from last digit.. int rem=y%10 .. Now after returning each digit of the num , we have to convert the string format num into int for finding the power of each digit .. process is:// in case of rem// s=s+(int)Math.pow(rem,p)>> again y=y/10// in case of for loop that we converted into  char//int m=Character.getNumericalValue(d)//.. check(s==k) it is armstrong else not..   * Number *Covert to string * return the each char * Convert into int * Find the power(length) * Check the condition 

2) Even: input the num , check the condition if ; num%2==0, then its even , else false
  
3) Factorial: To find the factorial the operation is multiplication of precessding digits of a num till 1., We will i/p a num let k, again we will run a for loop of range i=k;i>0;i--., declare a var m =1 for multiplication operation , m=m*i.. eg: i/p: 5.. 5 * 4.,20 * 3., 60 * 2;120 * 1
 
4) Farheniet to celcius: enter a num let y., int x=y-32*5/9
   
5) Fibonacci series: {0,1,1,2,3...} initially we declare a=0,b=1., run a for loop till what range we have to print the series, print 'a' value., c=a+b; a=b; b=c; (Here after operation we repetatively swap values)and print 'a' value ..
  
6) No.of digits in a num: I/p a num., initially count=0;if(num>0) c=1 rem=num%10(return the last digit, count++) print(count)..
  
7) Palindrome ( States that the original num== reversal of num) : Intially take a i/p  of a num, let 'i'>> u=i, now from the given num, return all digits from last position through (rem=i%10)., store that last digits in other var; r=r*10+rem; remove the last digit; i=i/10., check if r==u, it is palindrome..
   
8) Palindrome of a str:(Check if the original str== reversal str) ., I/p a string, use StringBuilder , and reverse it , check the condition for a str if original str==rev str., .equals() ...
   
9) Prime: To check if a num is a prime or composite we have to divide that num with under the range of sqrt of nums, and get rem==0., then it is not prime., I/p a num., Use boolean isPrime==true., run the for over  a range .. check the rem condition return the boolean condition..
  
10) Sum of n digits in a num., declare a var s=0., i/p a num. use the rem logic , ( returning the last digit ) ., process:s=s+rem ; remove the last digit num/=10; return the s value

11) sum of n nums: I/p the num value , run the for loop from the range of 1  to num., declare other var s=0; s=s+i; return the s value..


