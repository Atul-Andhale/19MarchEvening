package control_statement;

public class Else_ifStudy {

	public static void main(String[] args) {
		// DISTANCE IN FEET AND INCHES
		float dist=21f;
		
		if(dist<=10)
		{
			System.out.println("Size of column should 9*12 ");
		}
		
		else if(dist<=12 & dist>10)
		{
		System.out.println("Size of column should 9*15 ");	
		}
		
		else if(dist<=15 & dist>12)
		{
			System.out.println("Size of column should 9*18 ");
		}
		
		else if(dist<=20 & dist>15)
		{
			System.out.println("Size of column should 9*24 ");
		}
		else {
			System.out.println("Size of column need to find out ");
		}	
			
			
	}

}
