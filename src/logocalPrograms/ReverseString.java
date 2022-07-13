package logocalPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz Enter String to be Reverse");
		String name=sc.next();
		String b="";
		
		for (int i = name.length()-1; i >=0; i--) 
		{
			b=b+name.charAt(i);
		}
		
		System.out.println("Original String "+name);
		
		System.out.println("Reverse String "+b);

	}

}
