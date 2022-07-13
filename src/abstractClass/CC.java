package abstractClass;

public class CC extends AbstractStudy
{

	public static void main(String[] args) {
		
		CC c=new CC();
		c.test();
		c.test1();
		c.test2();
		c.sample1();
		c.sample();
	
		
}

	@Override
	public void test() {
		System.out.println("incomplete method from abstract");
		
	}

	@Override
	public void sample1() {
		System.out.println("incomplete from abstract");
		
	}
	 public void sample()
	 {
		 System.out.println("same class method");
	 }
}