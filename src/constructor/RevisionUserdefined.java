package constructor;

public class RevisionUserdefined {
	int x=40;
	int y=50;
	int z=60;
	
	public RevisionUserdefined()
	{
		x=20;
		
	}
    
	public RevisionUserdefined(int a, int b)
	{
		x=a;
		z=b;
	}
	public static void main(String[] args) {
	  
		RevisionUserdefined b= new RevisionUserdefined();
b.mul();
        RevisionUserdefined c=new RevisionUserdefined(10, 70);
     c.mul();
	}
public void mul()
{
	int multiplication =x*y*z; 
	
	System.out.println("miltiplication is "+multiplication);


}
}
