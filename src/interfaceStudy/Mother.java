package interfaceStudy;

public interface Mother
{

	void receipe();
	void care();
	default void money()
	{
		System.out.println("mothers money");
	}
	
	static void test()
	{
		System.out.println("mother test");
	}
}
