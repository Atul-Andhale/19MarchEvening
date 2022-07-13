package arrayStudy;

public class StringArray {

	public static void main(String[] args) {
		// ARRAY DECLAIRATION
		String Name[]=new String[4];
		
		//STRING DECLAIRATION
		
		Name[0]="AVINASH";
		Name[1]="SANTOSH";
		Name[2]="ANIL";
		Name[3]="ATUL";
		
		//ARRAY USAGE
		
		for(int i=0; i<=3; i++) 
		{
			System.out.println(Name[i]);
		}
		
		System.out.println("=============");
		
		for(int i=3; i>=0; i--) 
		{
			System.out.println(Name[i]);
		}
	}

}
