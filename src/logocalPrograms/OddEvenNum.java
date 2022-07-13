package logocalPrograms;

import java.util.Scanner;

public class OddEvenNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz eneter Value");
		
		int a = sc.nextInt();
		
		if (a%2==0) 
		{
			System.out.println("Number is Even Number");
		} 
		else 
		{
			System.out.println("Number is odd Number");

		}
		
		

	}

}
