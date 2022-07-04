package pkg1;
//(((((10+2)+2)-2)*2)/2)
public class Assign1 {
	
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
         Assign1 result = new Assign1();
         int sumresult = result.sum(10, 2, 2);
         int subresult = result.sub(sumresult, 2);
         int multiresult = result.multi(subresult, 2);
         result.div(multiresult, 2);
         
	}

}
