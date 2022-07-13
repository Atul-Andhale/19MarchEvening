package control_statement;

public class Nested_if_else_Study {

	public static void main(String[] args) {
		
		
		String ATM="Insert ATM";
		String Pass="ABC@123";
		
		if(ATM=="Insert ATM")
		{
			System.out.println("Plz insert Password");
			
			if(Pass=="ABC@123")
			{
				System.out.println("Plz collect your Cash");
			}
			else {
				System.out.println("Password is Incorrect");
			}
		}
		
		else {
			System.out.println("ATM not inserted");
		}
	}

}
