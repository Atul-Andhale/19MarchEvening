package finalKeywordUse;

public class Test {

	public static void main(String[] args)
	{
		int a=10;
		a=a+10;
		System.out.println("value of a is "+a);
		
		
		final int b=20;
		//b=b+10;   if we make any variable as final we cannot update the valueagain
		 
		int sum=a+b;
		System.out.println(sum);
		
		Test t=new Test();
		t.demo();
		
		
		
	}
	
	public final void demo()
	{
		System.out.println("Hi i am demo method of class");
	}
	
	public void demo1()
	{
		System.out.println("Hi i am demo method1 of class");
	}

}
