package Inhertiance;
class lord
{
	void power1()
	{
		System.out.println("I am the lord");
	}
}
class lord_son1 extends lord
{
	void power_son1()
	{
		System.out.println("I have the power1");
	}
}
class lord_son2 extends lord
{
	void power_son2()
	{
		System.out.println("I have the power2");
	}
}
public class Hierarchical_interitance {

	public static void main(String[] args) 
	{
		lord_son1 o1 = new lord_son1();
		o1.power_son1();
		o1.power1();
		
		lord_son2 b1 = new lord_son2();
		b1.power1();
		b1.power_son2();
		
	}

}
