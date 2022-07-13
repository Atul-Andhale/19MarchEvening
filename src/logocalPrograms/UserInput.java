package logocalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Value of a");
		int a=sc.nextInt();
		
		System.out.println("Please Enter the Value of a");
		int b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("Sum of a and b is "+sum);

		
	}

}
