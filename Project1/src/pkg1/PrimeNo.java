package pkg1;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		System.out.println("Enter the number ");
         Scanner num = new Scanner (System.in);
         int a = num.nextInt();
         for (int i=2;i<=a/2;i++)
         {
        	 if( a% i == 0)
        	 {
        		 System.out.println("It is not a prime number " +a);
        		 count = 1;
        		 break;
             }
         } 
             
          if (count==0)
        	{
        		System.out.println("It is a prime number "+a);
        	}
         }
	}

