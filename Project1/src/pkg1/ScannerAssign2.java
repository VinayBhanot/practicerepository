package pkg1;

import java.util.Scanner;

public class ScannerAssign2 {
	
	public int multi(int m, int n)
	 {
		int multiresponse = m*n;
		//System.out.println("Multiplication result " +multiresponse);
		return multiresponse;
	 }
	public int sub(int x, int y)
	 {
		int subresponse1 = x-y;
		//System.out.println("Substraction result " +subresponse);
		return subresponse1;
	 }
    public int sum(int a, int b) 
	  {
		int sumresponse = a+b;
		//System.out.println("Sum Result " +sumresponse);
		return sumresponse;
	  }
	public int sub2(int x, int y)
	 {
		int subresponse2 = x-y;
		//System.out.println("Substraction result " +subresponse);
		return subresponse2;
	 }
	public void div(int o, int p)
	 {
		int divresponse = o/p;
		System.out.println("Final result " +divresponse);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println("Enter the values required");
	    Scanner obj = new Scanner(System.in);
		   int x1 = obj.nextInt();
		   int x2 = obj.nextInt();
		   int x3 = obj.nextInt();
		   int x4 = obj.nextInt();
		   int x5 = obj.nextInt();
		   int x6 = obj.nextInt();
		   ScannerAssign2 result = new ScannerAssign2();
		   int multiresult = result.multi(x1, x2);
		   int subresult = result.sub(multiresult,x3);
		   int sumresult = result.sum(subresult,x4 );
		   int sub2result = result.sub2(sumresult,x5);
		   result.div(sub2result, x6);
	
     
	}

}
