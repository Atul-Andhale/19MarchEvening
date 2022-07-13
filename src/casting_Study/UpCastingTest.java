package casting_Study;

public class UpCastingTest {

	public static void main(String[] args)
	{
		Son s=new Son();
		s.bike();
		s.car();
		s.degree();
		System.out.println("============");
	
		Father f=new Son();
		f.bike();
		f.car();
		
		System.out.println("============");
		
		Father f1=new Father();
        f1.bike();
		f1.car();
		
	}

}
