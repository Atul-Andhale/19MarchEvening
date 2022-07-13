package arrayStudy;

public class BooleanArray {

	public static void main(String[] args) {
		// array declairation
		boolean decision[]=new boolean[2];
		
		//array value
		decision[0]=true;
		decision[1]=false;
		
		//usage
		for(int i=0; i<=1; i++) 
		{
			System.out.println(decision[i]);
			
		}
		
		System.out.println("===========");
		
		for(int i = decision.length-1; i>=1; i--)
		{
			System.out.println(decision[i]);
		}
		
		
		
	}

}
