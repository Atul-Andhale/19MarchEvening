package arrayStudy;

public class SplitArrySTUDY {

	public static void main(String[] args) {
		String s="THIS IS MY COUNTRY";
		
		String ar []= s.split(" ");
		
		for (int i=0;i<=ar.length-1;i++) 
		{
			System.out.println(ar[i]);
		}
		System.out.println("==============");
		
		String m="I_LOVE_MY_INDIA";
		
		String arry[]=m.split("_");
		
		for(int j=0; j<=arry.length-1;j++)
		{
			System.out.println(arry[j]);
		}
		

	}
	
	

}
