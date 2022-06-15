package Arrays;

import java.util.Scanner;
public class arr
{

	public static void main(String[] args)
	{
		
		int [] a= new int [3]; //data type ,array name ,array length while declaration 
		int len; //variable name is len data type is int
		Scanner sc = new Scanner(System.in);// object name or reference name is sc
		System.out.println("Enter the value for len:");
		len = sc.nextInt();
		System.out.println("Enter the array element");
		for(int i=0;i<len;i++) 
		{
			a[i] = sc.nextInt();//itr1 a[0].iter 2 a[1],itr3 a[2]		
		}
		//a = [1,100,200]
		System.out.println("Array element are :");
		for(int i =0;i<len;i++)
		{
			System.out.println(a[i]+" ");
		}
			
		}

}
