package inheritance;

public class HeerachicallInheritance {

	public static void main(String[] args) {
		
		Father F=new Father();
		F.Feeling();
		
		Daughter D=new Daughter();
		D.Feeling();           // calling father properties by daughter obj
		D.Scooty();            // calling own properties
		
		Son S=new Son();
		S.Feeling();         // calling fathers properties by sons obj
		S.Bike();		     // calling own properties
		
	}

}
