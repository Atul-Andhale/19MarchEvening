package thisandSuperkeywordUse;

public class ThisUse {

	int a=100;  // non static public variable 
	int b=500;
	static int c=300;  // static public variable
	public static void main(String[] args) {
		
		ThisUse aa=new ThisUse();
		aa.add();
		
	}
	
	public void add()
	{
		int a=50;   // non static local variable
		 int sum=a+100;  //a value will reffred as local variable
		 System.out.println(sum);
		 int sum1=this.a+500; // calling global variable by using keyword
		 System.out.println(sum1);
	}

}
