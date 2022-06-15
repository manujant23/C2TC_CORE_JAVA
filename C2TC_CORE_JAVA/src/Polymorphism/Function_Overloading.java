package Polymorphism;

public class Function_Overloading
{
public static void main(String []args)
{
		float pi = 3.14f;
		Function_Overloading obj1 = new Function_Overloading();
		obj1.volumn(5);
		obj1.volumn(2, pi);
		obj1.volumn(2, 3, 4);
}
public void volumn(int s)
{
	double volume_cube = s*s*s;
	System.out.print("Volumne of the cube : ");
	System.out.println(volume_cube);
}
public void volumn(int r,double pi)
{
	double volume_sphere = (4/3)*(pi)*  (r*r*r);
	System.out.print("Volumne of the sphere : ");
	System.out.println(volume_sphere);
}
public void volumn(int l,int b,int h)
{
	double volume_cuboid = l*b*h;
	System.out.print("Volumne of the cuboid : ");
	System.out.println(volume_cuboid);
}
}