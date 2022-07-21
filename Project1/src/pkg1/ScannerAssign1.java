package pkg1;
//(((((x1+x2)+x3)-x4)*x5)/x6)
import java.util.Scanner;

public class ScannerAssign1 {

	public int sum(int a, int b, int c) 
	  {
		int sumresponse = a+b+c;
		//System.out.println("Sum Result " +sumresponse);
		return sumresponse;
	  }
	public int sub(int x, int y)
	{
		int subresponse = x-y;
		//System.out.println("Substraction result " +subresponse);
		return subresponse;
	}
	public int multi(int m, int n)
	{
		int multiresponse = m*n;
		//System.out.println("Multiplication result " +multiresponse);
		return multiresponse;
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
		   ScannerAssign1 result = new ScannerAssign1();
		   int sumresult = result.sum(x1,x2,x3);
		   int subresult = result.sub(sumresult,x4 );
		   int multiresult = result.multi(subresult, x5);
		   result.div(multiresult, x6);
	
       
	}

}
