package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
	//method overloading means declararing multiple mrthods with same method name but with
		//differnt argument in a same class is called method overlading
		
		
		MethodOverloading cc=new MethodOverloading();
		cc.test();
		cc.test(20, 50);
		cc.test(10, 10, 10);
	}
	
	public void test()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public void test(int a, int b)
	{ 
		int sum =a+b;
		System.out.println("sum is "+sum);
	}
	
	public void test(int a, int b, int c)
	{
		int sum =a+b+c;
		System.out.println("sum is "+sum);
	}

}
