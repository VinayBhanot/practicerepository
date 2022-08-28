package pkg1;

import java.util.Scanner;

public class PalindroneNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner number = new Scanner(System.in);
       System.out.println("Enter the number:");
       int num = number.nextInt();
       int rem,temp, sum=0;
       temp=num;
       while(num>0)
       {
    	   rem = num%10;
    	   sum = (sum*10)+rem;
    	   num = num/10;
       }
       if(temp==sum)
       {
    	   System.out.println("It is Palindrone number" +temp);
       }
       else
       {
    	   System.out.println("It is not Palindrone number "+temp);
       }
       
	}

}
