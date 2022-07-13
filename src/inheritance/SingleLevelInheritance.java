package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		 // to call non static property i need mothers object
		Mother m=new Mother();  //created object of mothers class
		  
		// to call non static object from childs property need childs object
		
		Child n= new Child(); //created object of childs class
		
		
		m.nature();     //calling mothes non static property
		Mother.care();   // calling mothers static property 
		
		n.mobile();     // calling childs non static proprty 
		Child.laptop();   // calling childs static propety
		
		n.nature();     // by using childs object we are calling mothers property
		Child.care();   //by using childs class we are calling mothers property 
	}

}
