package accessSpecifiers;

public class PrivateUse {

	public static void main(String[] args) 
	{ 
		PrivateUse pu=new PrivateUse();
		pu.test1();  //calling private
		pu.test2();   //calling default
		pu.test3();  //calling protected
		pu.test4();   //calling public

	}
	
	private void test1()         //only within class it cant access from another class 
	{
		System.out.println("hi this is private test1 method");
	}
	
	void test2()        //scope only within package 
	{ 
		System.out.println("hi this is default test2 method");
	}
 
	protected void test3()  //scope in package ....inheritace outside the class
	{
		System.out.println("hi this is protected test3 method");
	}
	
	public void test4()
	{
		System.out.println("hi this is public test4 method");
	}
}
