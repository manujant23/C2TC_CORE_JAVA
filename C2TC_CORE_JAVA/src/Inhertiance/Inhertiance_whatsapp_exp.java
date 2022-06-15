package Inhertiance;

class whats1
{
void mess()
{
	System.out.println("I am message:");
}
}
class whats2 extends whats1
{
	void pic()
	{
		System.out.println("I am pic");
	}
}
class whats3 extends whats2
{
	void video()
	{
		System.out.println("I am video");
	}
}
public class Inhertiance_whatsapp_exp {

	public static void main(String[] args) 
	{
		whats3 jesus = new whats3();
		jesus.mess();
		jesus.pic();
		jesus.video();
	}

}
