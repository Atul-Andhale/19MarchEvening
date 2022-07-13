package arrayStudy;

public class IntARRAY {

	public static void main(String[] args) {
		// ARRY DECLAIRATION
		
		int marks[]=new int[7];
		
		//Arry intialization
		
		marks[0]=99;
		marks[1]=90;
		marks[2]=60;
		marks[3]=87;
		marks[4]=50;
		marks[5]=94;
		marks[6]=91;
		
		//array usage
		
		for(int i=0;i<=marks.length-1; i++) 
		{
			System.out.println(marks[i]);
		}
		 
		System.out.println("===============");
		for(int i=marks.length-1; i>=0; i--) 
		{
			System.out.println(marks[i]);
		}
	}

}
