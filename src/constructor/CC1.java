package constructor;

public class CC1 {

	int a=10;
	int b=20;
	// new git program 
	// new git program
	// new git program
	public CC1()
	{
	a=100;
	b=200;
	
		
	}
	public CC1(int x)
	{
		a=x;
		
	}
       public CC1(int x,int y)
{
	a=x;
	b=y;


}
	
	
	public static void main(String[] args) {
		CC1 add=new CC1();
		add.addition();
	 CC1 add1=new CC1(900);
		add1.addition();
	CC1 b=new CC1(50, 60);
	b.addition();
	}
	
	
	
	public void addition()
	{
		int sum=a+b;
				System.out.println("additio is "+ sum);
	}

}
