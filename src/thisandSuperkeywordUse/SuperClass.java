package thisandSuperkeywordUse;

public class SuperClass extends ThisUse
{
	int a=200;

	public static void main(String[] args) {
		SuperClass ad=new SuperClass();
		ad.add1();
		

	}

	public void add1()
	{
		int a=60;
		
		int sum=a+50;  //value will refferd local variable
		System.out.println(sum);
		
		int sum1=this.a+60; // global value of same class by using this variable
		System.out.println(sum1);
		
		int sum2=super.a+100;  // calling global variable of super class by using super
		System.out.println(sum2);
	}
}
