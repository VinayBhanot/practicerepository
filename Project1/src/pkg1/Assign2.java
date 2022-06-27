package pkg1;
// (((((10/2)-2)-2)+2)*2)
public class Assign2 {
	
	public int  div(int o, int p)
	{
		int divresponse = o/p;
		//System.out.println("Division result " +divresponse);
	    return divresponse;
	}
	
	public int sub(int a, int b) 
	  {
		int subresponse = a-b;
		//System.out.println("Sub Result " +subresponse);
		return subresponse;
	  }
	public int sum(int x, int y)
	{
		int sumresponse = x+y;
		//System.out.println("Sum result " +sumresponse);
		return sumresponse;
	}
	public void multi(int m, int n)
	{
		int multiresponse = m*n;
		System.out.println("Final result " +multiresponse);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Assign2 output = new Assign2();
       int divoutput = output.div(10, 2);
       int sub1output = output.sub(divoutput, 2);
       int sub2output = output.sub(sub1output, 2);
       int sumoutput = output.sum(sub2output, 2);
       output.multi(sumoutput, 2);
	}

}
