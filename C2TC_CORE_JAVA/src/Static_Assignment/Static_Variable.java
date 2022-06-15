package Static_Assignment;

class Student1
{  
   int rollno;
   
   String name;  
   static String college ="ITS";
   
    
   Student1(int r, String n)
   {  
   rollno = r;  
   name = n;  
   }  
   
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}  
 
public class Static_Variable
{  
 public static void main(String [] args)
 {  
 Student1 s1 = new Student1(111,"Karan");  
 Student1 s2 = new Student1(222,"Aryan");  
 s1.display();  
 s2.display();  
 }  
}  