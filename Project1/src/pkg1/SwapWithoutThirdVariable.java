package pkg1;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a, b;
         Scanner value = new Scanner(System.in);
         System.out.println("Enter two numbers");
         a = value.nextInt();
         b = value.nextInt();
         System.out.println("Before swap a = "+a +"b = "+b);
         a = a+b;
         b = a-b;
         a = a-b;
         System.out.println("After swap a = "+a +"b = "+b);
	}

}
