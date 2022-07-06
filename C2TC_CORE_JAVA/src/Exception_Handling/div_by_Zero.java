package Exception_Handling;

public class div_by_Zero {

	public static void main(String[] args) 
	{
		System.out.println("Starting of program");
		try
		{
			int a = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		//this leads to inifit so java code is throwing the run time exeception here 
		
		System.out.println("Ending of program");
	}
}
