package assgn2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class PyramidCreation2Test{
	
	PyramidCreation2 Piramid2=new PyramidCreation2();
	
	@Test
	public void testPyramidCreation(){
		String expArray[]={"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(expArray, Piramid2.PyramidCreation(5));		
	}

	@Test
	public void testGetSpaces(){
		String expSpaces="  ";
		assertEquals(expSpaces, Piramid2.getSpaces(3));	
	}

	@Test
	public void testGetNumberSeries(){
		String expNoSeries="123";
		assertEquals(expNoSeries, Piramid2.getNumberSeries(5,3));	
	}	
}