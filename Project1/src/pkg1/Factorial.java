package pkg1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fact=1;
      Scanner num = new Scanner(System.in);
      System.out.println("Enter the number");
      int number = num.nextInt();
      for(int i = 1;i<=number;i++)
      {
    	  fact = fact*i;
      }
    	  System.out.println("Factorial of the number is "+fact);
      }
    		  
	}


