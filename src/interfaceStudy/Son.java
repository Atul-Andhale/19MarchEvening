package interfaceStudy;

public class Son implements Father,Mother
{

	public static void main(String[] args) {
		
		Son s=new Son();
		s.nature();
		s.care();
		s.receipe();
		s.love();
		s.money();
		Father.test();  //calling static method from fathers class
		Mother.test();   //calling static method from mothers class
		
		
	}

	@Override
	public void receipe() {
		System.out.println("Mother receipe completed in son class");
	}

	@Override
	public void care() {
		System.out.println("Mother care completed in son class");

}

	@Override
	public void love() {
		
		System.out.println("father love completed in son class");
	}

	@Override
	public void nature() {
		System.out.println("father nature completed in son class");
		
	}

	@Override
	public void money() {
		
		Father.super.money();
		Mother.super.money();
	}

}
