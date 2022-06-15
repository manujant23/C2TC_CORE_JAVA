package Conditional_Stmnts;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name");
		String Name = scan.next(); //Name = manu
		
		if(Name.equals("manu"))
		{
			System.out.println("I am manu : so what ");
		}
		else
		{
			System.out.println("Not its dummu");
		}
		
	}

}