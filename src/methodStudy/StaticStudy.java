package methodStudy;

public class StaticStudy {

	public static void main(String[] args) {
		
		addition();
		StaticStudy subb= new StaticStudy();
		subb.subtraction();
		
	}

	
	public static void addition()
	{
		int a=10;
		int b=20;
		int add=a+b;  
		 System.out.println("addition is "+add);
			
	}
	
	public void subtraction() 
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println("subtraction is "+sub);
	}
	
	
}
