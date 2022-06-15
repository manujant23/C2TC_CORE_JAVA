package Class_Object;

public class Prac2_class_objects {

	public static void main(String [] args) 
	{
		car seden = new car();
		car convertable = new car();
		car suv = new car();
		
		seden.make = "audi";
		seden.model = "A7";
		seden.year=2021;
		seden.color="red";
		
		
	}

}
class car
{
	String make;
	String model;
	int year;
	String color;
	void start()
	{
		System.out.println("Start");
	}
	void Accelearte()
	{
		System.out.println("Accelerate");
	}
	void stop()
	{
		System.out.println("Stop");
	}
}
