package Constructor;

public class Constructor_Example2 
{
	int empid;
	String empname;
	Constructor_Example2 (int a,String b)
	{
		empid = a;
		empname = b;
		
	}
	public static void main (String [] args)
	{
		Constructor_Example2 box = new 	Constructor_Example2(23,"inspration");
		System.out.println(box.empid);
		System.out.println(box.empname);
		Constructor_Example2 box1 = new 	Constructor_Example2(24,"cricket");
		System.out.println(box1.empid);
		System.out.println(box1.empname);
	}
     
}

