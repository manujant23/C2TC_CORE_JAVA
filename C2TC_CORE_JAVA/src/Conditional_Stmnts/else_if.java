package Conditional_Stmnts;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Value:");
		int value = scan.nextInt();//5
		
		if(value == 1)
		{
			System.out.println("I");
		}
		else if(value == 2)
		{
			System.out.println("II");
		}
		
		else if(value == 3)
		{
			System.out.println("III");
		}
		else if(value == 4)
		{
			System.out.println("IV");
		}
		else
		{
			System.out.println("we will provde the output only for 1 2 3 .");
		}
		
		
	}

}