package interfaceStudy;

public class MyClass implements MyInterface
{

	public static void main(String[] args) {
		
		MyClass m= new MyClass();
		m.test();
		m.test1();
		m.myMethod();
	

	}

	@Override
	public void test() {
		
		System.out.println("hi this method completed in implementation class");
		
	}

	@Override
	public void test1() {
		
		System.out.println("hi this method completed in implementation class");
		
	}
	
	public void myMethod()
	{
		System.out.println("hi this my class method");
	}

}
