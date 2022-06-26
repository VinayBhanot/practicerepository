package pkg1;

public class Methodthis 
{
	public void Method1() {
    	System.out.println("Default Method");
    	this.Method2(1);
    }
    public void Method2(int a) {
    	System.out.println("One parametrized method ");
    	this.Method3(1,2);
    }
    public void Method3(int a, int b) {
    	System.out.println("Two parametrized method");
    	this.Method5(1,2,3,4);
    }
    public void Method4(int a, int b, int c) {
    	System.out.println("Three parametrized method");
    	this.Method1();
    }
    public void Method5(int a, int b, int c, int d) {
    	System.out.println("Four parametrized method");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Methodthis obj= new Methodthis();
     obj.Method4(1,2,3);
     
	}

}
