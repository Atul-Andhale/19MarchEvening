package constructor;

public class Employee1 {
	String emp_name ;
	int emp_id;
	float emp_sal;
	String emp_dep; 
	char genger;
	
	public Employee1(	String emp_nav,int emp_id2,float emp_sal2,String emp_dep2,char genger)
	{
		emp_name=emp_nav;
		emp_id=emp_id2;
		emp_sal=emp_sal2;
		//emp_dep=emp_dep2;
	}
     public void empinfo1()
	{
    	
		System.out.println("==========================");
		System.out.println("Name of employee is "+emp_name);
		System.out.println("Employee id is "+emp_id);
		System.out.println("Employee salary is "+emp_sal);
		System.out.println("Employ dep is "+emp_dep);
		System.out.println("Employee gender is "+genger);
	}


}
