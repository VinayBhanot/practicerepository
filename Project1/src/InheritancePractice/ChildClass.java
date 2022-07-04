package InheritancePractice;

public class ChildClass extends ParentClass{
	public ChildClass()
	{
		this(1,2);
		System.out.println("ChildClass default constructor");
	}
	public ChildClass(int a)
	{
		this(1,2,3,4);
		System.out.println("ChildClass 1 parameterized constructor");
	}
	public ChildClass(int a,int b)
	{
		super(1);
		System.out.println("ChildClass 2 parameterized  constructor");
	}
	public ChildClass(int a, int b, int c)
	{
		this();
		System.out.println("ChildClass 3 parameterized  constructor");
	}
	public ChildClass(int a, int b, int c, int d)
	{
		this(1,2,3);
		System.out.println("ChildClass 4 parameterized  constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass(1);
	}

}
