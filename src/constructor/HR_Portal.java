package constructor;

public class HR_Portal {

	public static void main(String[] args) {
		
		
		Employee SachinT=new Employee(); 
		
		SachinT.emp_name="Sachin tendulkar";
		SachinT.emp_id=1;
		SachinT.emp_dep="Batting";
		SachinT.emp_sal=14555.45f;
		SachinT.genger='M';
		
		Employee Zaheerk=new Employee();
		
		Zaheerk.emp_name="Zaheer khan";
		Zaheerk.emp_id=2;
		Zaheerk.emp_dep="Bowling";
		Zaheerk.emp_sal=12345.14f;
		Zaheerk.genger='M';
		
		
		SachinT.emp_info();
		Zaheerk.emp_info();
	}

}
