package Class_Object;

public class Practice
{

	public static void main(String[] args)
	{
		student s1 = new student();//object1
		s1.Name= "Rahul";
		s1.school();
		
		
		student s2 = new student();//object2
		s2.Name = "manu";
		s2.school();
		
		student s3 = new student();
		s3.Name = "Raju";
		s3.school();
		
	}

}
class student
{
	String Name;
	void school()
	{
	System.out.println(Name + " is is going to school");
	}
	

	}
