package pkg1;

public class Student 
{
   int age;
   int rollno;
   public void method1()
   {
	   System.out.println("Welcome to all");
   }
   public void method2()
   {
	   System.out.println("Automation is very easy");
	}
   public static void main(String[] args)
   {
	Student s1= new Student();
	s1.age= 5;
	s1.rollno= 1;
	System.out.println("Age of student is " +s1.age);
	System.out.println("Roll number of student is " +s1.rollno);
	s1.method1();
	s1.method2();
	
   }
}
