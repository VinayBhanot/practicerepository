package pkg1;

import java.util.Scanner;

public class SwapWithThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b, c;
      Scanner value = new Scanner(System.in);
      System.out.println("Enter two numbers");
          a = value.nextInt();
      //System.out.println("Enter the second no.");
          b = value.nextInt();
      System.out.println("Before swap a = " +a +" b = " +b);
          c = a;
          a = b;
          b = c;
      System.out.println("After swap a = " +a +" b = " +b);
      
	}

}
