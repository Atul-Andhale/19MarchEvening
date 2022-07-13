package arrayStudy;

public class MultipleArray {

	public static void main(String[] args) {
		
		 char Div[][]=new char[2][2];
		 
		 Div[0][0]='A';
		 Div[0][1]='B';
		 Div[1][0]='C';
		 Div[1][1]='D';

		 for(int i=0;i<=Div.length-1;i++)
		 {
			
			 for(int j=0; j<=Div.length-1;j++) 
			 {
				 System.out.print(Div[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}
