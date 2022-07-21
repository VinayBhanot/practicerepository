package pkg1;

import java.util.Scanner;

public class JulyScannerAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of x1");
        int x1 = obj.nextInt();
        System.out.println("Enter the value of x2");
        int x2 = obj.nextInt();
        System.out.println("Enter the value of x3");
        int x3 = obj.nextInt();
        System.out.println("Enter the value of x4");
        int x4 = obj.nextInt();
        System.out.println("Enter the value of x5");
        int x5 = obj.nextInt();
        System.out.println("Enter the value of x6");
        int x6 = obj.nextInt();
        int Sumresult = x1+x2+x3;
        int Subresult = Sumresult-x4;
        int Multiresult = Subresult*x5;
        int Divresult = Multiresult/x6;
        System.out.println("The fimal result is " +Divresult);
	}

}
