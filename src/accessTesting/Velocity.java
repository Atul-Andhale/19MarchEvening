package accessTesting;

import accessSpecifiers.PrivateUse;

public class Velocity extends PrivateUse{

	public static void main(String[] args) {
		PrivateUse p=new PrivateUse();
		p.test4();
		
		Velocity v=new Velocity();
		v.test3();
		v.test4();
		

	}

}
