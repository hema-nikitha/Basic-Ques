1) Armstrong number: Here we input 1 number , which can be of any no.of digited, if we do the power of each digit with equal to its length of the num., the resulted num should be equal to the input num..To find the power of each digit of a number , we have to access each digit, there are various processes to access each digit of a num .,.. 1) We have to  convert the number into string., i.e let int y , the that value is stored in other var, let int k=y, Convert the int num into String, int p=String.valueOf(y), Finding the length of the num(String) for calculating power of each digit , int p=String.valueOf(y).length()  // int l=p.length() , Create other var so all the processes is done through it let int s=0..constraint while(y!=0)... To acess each and every char of the String num there are 2 processes ., 1) Create a for loop i.e., for(char p:y.toCharArray()) // We'll find the reminder for accessing the each digit of a num , from last digit.. int rem=y%10 .. Now after returning each digit of the num , we have to convert the string format num into int for finding the power of each digit .. process is:// in case of rem// s=s+(int)Math.pow(rem,p)>> again y=y/10// in case of for loop that we converted into  char//int m=Character.getNumericalValue(d)//.. check(s==k) it is armstrong else not..    
    
