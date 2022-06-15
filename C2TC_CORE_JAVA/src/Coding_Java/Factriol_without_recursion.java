package Coding_Java;

public class Factriol_without_recursion
{  
	 public static void main(String args [])
	 {  
	  int fact=1;  
	  int number= 97;   
	  for(int i=1;i<=number;i++)
	  {    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
	}  
