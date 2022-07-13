package methodStudy;

public class methodstudyDay1 {

	public static void main(String[] args) 
	{
      methodStudy1();    //calling static regular method from same class
      method2();         // calling static regular method from same class
      Testing.display(); //calling static regular method from another class
      Testing.calculation(); //calling static regular method from another class 
	}
       public static void methodStudy1()
       {
    	   System.out.println("hi, this is methodStudty1");
       }
       
       public static void method2()
       {
    	   System.out.println("this is method2");
       }
       
}
