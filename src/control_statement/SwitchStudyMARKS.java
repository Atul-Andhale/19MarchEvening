package control_statement;

public class SwitchStudyMARKS {

	public static void main(String[] args) {
		char Grade='H';
		
		switch (Grade) {
		case 'A':System.out.println("You got Marks>=65");
		break;
		case 'B':System.out.println("You got Marks<65 & Marks>=60");
		break;
		case 'C':System.out.println("You got Marks<60 & Marks>=50");
		break;
		case 'D':System.out.println("You are just pass");
		break;
	
	
		default:System.out.println("Plz Enter Valid Grade");
			break;
		} 

	}

}
