package inheritance;

public class MultilevelInheritanceStudy {

	public static void main(String[] args) {
		
	//to call grandmother properties object 
		GrandMother gm= new GrandMother();
		gm.Stories();
		GrandMother.Recipe();
		
		// to call mother properties 
		Mother a=new Mother();
		a.nature();    //calling mother properties with mothers object
	    a.Stories();    // calling grandmother properties by mother object
		Mother.care();  // calling mother static properties
		Mother.Recipe();
		
		Child c=new Child();
		c.Stories();    //calling grandmother properties by child object
		c.nature();      //calling mother properties by child object
		c.mobile();      // calling own properties
		Child.Recipe();   //calling grandmother properties by child class
		Child.care();      //calling mother properties by child class
	}

}
