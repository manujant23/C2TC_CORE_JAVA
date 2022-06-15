package Static_Assignment;

class Static_Innerclass
{  
	  static int data=30;  
	  static class Inner
	  {  
	   void msg()
	   {
		   System.out.println("data is "+data);
	   }  
	  }  
	  public static void main(String [] args)
	  {  
		  Static_Innerclass.Inner obj=new Static_Innerclass.Inner();  
	  obj.msg();  
	  }  
	}  