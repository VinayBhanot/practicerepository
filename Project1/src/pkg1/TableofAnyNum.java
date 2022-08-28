package pkg1;

import java.util.Scanner;

public class TableofAnyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the number:");
     Scanner num = new Scanner(System.in);
     int number = num.nextInt();
     for(int i=1;i<=10;i++)
     {
    	 System.out.println(number +" *" +" "+i+" "+ "=" +" "+number*i );
     }
	}

}
