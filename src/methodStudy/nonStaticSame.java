package methodStudy;

public class nonStaticSame {

	public static void main(String[] args) {
		
		nonStaticSame a = new nonStaticSame();
	    a.non();
 
	    anotherClassNon b = new anotherClassNon();
	    b.display();
	    
	    nonStaticSame c = new nonStaticSame();
	    c.png();
	    
	    anotherClassNon d = new anotherClassNon();
	    d.running();
	    
	    anotherClassNon cd1=new anotherClassNon();
	    cd1.patientInfo10("anil",'A',1, 98.2f);
	}
    
	
	public void non()
	{
		System.out.println("hi this is non ststic from same class");
	}
	
	public void png()
	{
		System.out.println("hi another same class");
	}
}
