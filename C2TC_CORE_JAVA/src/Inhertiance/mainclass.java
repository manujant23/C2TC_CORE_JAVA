package Inhertiance;

interface Animal
{
public void noise();
}
class cat implements Animal
{
public void noise()
{
	System.out.println("meow");
}
}
class dog implements Animal
{
public void noise()
	{
		System.out.println("bow");
	}
}
class snake implements Animal
{
public	void noise()
	{
		System.out.println("buss");
	}
}
class stimulator
{
	static void smiles(Animal a1)
	{
		a1.noise();
	}
}
public class mainclass
{
	public static void main (String [] args)
	{

		cat c1 = new cat();
		dog d1 = new dog();
		snake s1 = new snake();
		stimulator.smiles(c1);
		stimulator.smiles(d1);
		stimulator.smiles(s1);
		
	}
	}