package Conditional_Stmnts;

import java.util.Scanner;

public class voting_age {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the age");
		int age = scan.nextInt();
		
		if(age >= 18)
		{
			System.out.println("You can vote...!");
		}
		else
		{
			System.out.println("You cannot vote...!");
		}

	}

}
