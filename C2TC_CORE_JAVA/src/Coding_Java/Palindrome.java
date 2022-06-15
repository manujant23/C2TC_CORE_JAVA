package Coding_Java;

public class Palindrome
{

	public static void main(String[] args)
	{
		String s1 = "mom";
		String s2 = "";
		int length = s1.length();//length = 6
		for(int i=length-1;i>=0;i--) //i = 5
		{
			s2=s2+s1.charAt(i);//i =5-->a-->s2=a-----------------i=4--->j-->s2=aj-----> i=3--->u-->s2=aju---->i=2---->n-->s2=ajun-->i=1--->a-->s2=ajuna----i=0,---m---s2=ajunam
		}
		
		       if(s1.equals(s2))
		       {
		           System.out.println("it is a palindrom");
		       }
		       else
		       {
		           System.out.println("it is not a palindrom");
		       }
		    
		
		
		

	}

}