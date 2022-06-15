package Final_Static_Keyword;

class Final_Example
{  
 int speedlimit=90; 
 void run()
 {  
  speedlimit=400;  
 }  
 public static void main(String args [])
 {  
 Final_Example obj=new  Final_Example();  
 obj.run();  
 }  
}
