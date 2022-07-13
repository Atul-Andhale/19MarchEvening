package arrayStudy;

public class CharArray {

	public static void main(String[] args) {
		// CHAR ARRAY DECLAIRATION
		char grade[]=new char[6];
		
		//array initialization
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		//CHAR ARRAY USAGE
		
		for(int i=0; i<=5; i++)
		{
			System.out.println(grade[i]);
		}
		
		System.out.println("===========");
		
		for(int i=5; i>=0; i--)
		{
			System.out.println(grade[i]);
		}

	}

}
