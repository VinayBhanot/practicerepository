package pkg1;

public class Conthis 
{
    public Conthis() {
    	this(2,3,4);
    	System.out.println("Default constructor");
    }
    public Conthis(int a) {
    	this();
    	System.out.println("One parametrized ");
    }
    public Conthis(int a, int b) {
    	this(66);
    	System.out.println("Two parametrized");
    }
    public Conthis(int a, int b, int c) {
    	System.out.println("Three parametrized");
    }
    public Conthis(int a, int b, int c, int d) {
    	this(11,111);
    	System.out.println("Four parametrized");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Conthis obj = new Conthis(22,33,44,55);
	}

}
