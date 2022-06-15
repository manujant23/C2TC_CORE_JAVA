package Inhertiance;

public class Inhetitanec_Exx1 {

	public static void main(String[] args) 
	{
		child ball = new child();
		ball.disp1();
		ball.disp();
	}

}

class parent
{
	void disp()
	{
		System.out.println("I am parent class method");
	}
}
class child  extends parent
{
	void disp1()
	{
		System.out.println("I am child class");
	}
}
