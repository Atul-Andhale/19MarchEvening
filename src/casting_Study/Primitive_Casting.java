package casting_Study;

public class Primitive_Casting {

	public static void main(String[] args) 
	{
		int a=20;  // lower data type information
		System.out.println(a);
		
		double b=a;  // converted to higher data type info implicit casting or widening casting
		
		System.out.println(b);
		
		
		double z=50;  // higher data type information
		System.out.println(z);
		
		int y= (int) z;  // converting to lower data type info explicit casting or narrowing casting
		 
		System.out.println(y);
		
		

	}

}
