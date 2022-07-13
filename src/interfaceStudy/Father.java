package interfaceStudy;

public interface Father
{
	
	void love();
	void nature();
	default void money()
	{
		System.out.println("fathers money");
	}
	
	static void test()
	{
		System.out.println("Father test");
	}

}
