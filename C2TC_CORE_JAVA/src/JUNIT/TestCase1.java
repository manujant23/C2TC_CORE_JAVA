package JUNIT;


import JUNIT.operations;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testcase1
{

	@Test
	void test() 
	{
	operations p2 = new operations();
	int d;
	d=p2.add(2, 5);
	assertEquals(d,7);
	
	}

}



