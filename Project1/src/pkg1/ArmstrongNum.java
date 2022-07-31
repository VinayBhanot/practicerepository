package pkg1;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,rem, temp , sum = 0;
       System.out.println("Enter the number:");
       Scanner num = new Scanner(System.in);
        number = num.nextInt();
        temp= number;
        while(number>0) 
        {
        	rem = number%10;
            sum = sum+(rem*rem*rem);
            number  = number/10;
        }
            if (sum==temp)
            {
            	System.out.println("It is Armstrong number " +temp);
            }
            else
            {
            	System.out.println("It is not Armstrong number " +temp);
            }
        }
         
	}
