package methodStudy;

public class InformationTwo {

	public static void main(String[] args) {
	
		InformationTwo Info= new InformationTwo();
		Info.patientInfo("Kunal",'B',12, 99.1f);
		Info.patientInfo("Anil",'C',18, 98.4f);
        
		studentMarks("Atul", 80, 90 ,75 , 85);
		studentMarks("Suraj", 76, 90 ,88 , 55);
		studentMarks("Atul", 60, 87 ,74 , 95);
		
		
	}
	

	public void patientInfo(String patientName, char wardName, int bedNo, float fever )
	{
		System.out.println("===============================");
		System.out.println("Patient name is "+patientName);
		System.out.println("Patient ward is "+wardName);
		System.out.println("Patient bed no is "+bedNo);
		System.out.println("Patient fever is "+fever);
		System.out.println("===============================");
		
	}
	 
	    public static void studentMarks(String studentName, int Marathi, int Hindi,int English, int History)
	    {
	    	System.out.println("=======================");
	    	System.out.println("Student Name : "+studentName);
	    	System.out.println("Marathi : "+ Marathi);
	    	System.out.println("Hindi : "+ Hindi);
	    	System.out.println("English : "+ English);
	    	System.out.println("History : "+ History);
	    	int totalMarks= Marathi+Hindi+English+History;
            System.out.println("Total Marks : "+totalMarks);
            float Percentage = (totalMarks/400f)*100;
            System.out.println("Percentages : "+ Percentage);
            System.out.println("=======================");
	    
	    }
}
