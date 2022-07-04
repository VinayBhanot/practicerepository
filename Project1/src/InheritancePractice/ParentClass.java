package InheritancePractice;

public class ParentClass {
	public ParentClass()
	{
		this(1,2,3);
		System.out.println("ParentClass default constructor");
	}
	public ParentClass(int a)
	{
		this(1,2);
		System.out.println("ParentClass 1 parameterized constructor");
	}
	public ParentClass(int a,int b)
	{
		this(1,2,3,4);
		System.out.println("ParentClass 2 parameterized  constructor");
	}
	public ParentClass(int a, int b, int c)
	{
		System.out.println("ParentClass 3 parameterized  constructor");
	}
	public ParentClass(int a, int b, int c, int d)
	{
		this();
		System.out.println("ParentClass 4 parameterized  constructor");
	}
}
