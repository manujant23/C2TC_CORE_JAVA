package Coding_Java;

public class Starpattern2 
{

	public static void main(String[] args) 
	{
		for(int j=0;j<5;j++)
		{
			for(int i=0;i<5;i++)	
			{
				if(i==0 || i==4 || j==0 || j==4)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println("");			
		}
			
	}

}
