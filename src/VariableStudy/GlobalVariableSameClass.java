package VariableStudy;



public class GlobalVariableSameClass {

	int a=100;
	static int b=200;
	
	
	
	public static void main(String[] args) {
		
		GlobalVariableSameClass CC1=new GlobalVariableSameClass();
		CC1.Test();
		Test1();
		
		//int sum=200+CC1.a;    //non static variable from same class ojt.variable
		
		VariableFromAnotherClass AA1=new VariableFromAnotherClass();// non static variable fom another class ojt.variable
		System.out.println("Value of P is "+AA1.p);
        System.out.println("Value of q is "+VariableFromAnotherClass.q);//static variable from another class classname.variable
        
        int sum2=100+VariableFromAnotherClass.q;
        System.out.println("sum is "+sum2);
        int sum3=200+AA1.p;
        System.out.println("sum is "+sum3);
        
        		
	}

	public void Test()
	
	{
		int sum=a+500;
		int sum1=b+200;
		System.out.println("sum is equal to "+sum);
		System.out.println("sum is equal to "+sum1);
	}
	
	public static void Test1()
	{   
		int sum=100+b;
		System.out.println("sum is equal to "+sum);
		
	}
}
