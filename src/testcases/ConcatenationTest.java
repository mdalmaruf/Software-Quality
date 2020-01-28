package testcases;

import myClass.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatenationTest {

	@Test
	public void test() {
		String expected = "SOFE-3950";
		String actual = MyClass.concatenate("SOFE-", "3950");
		assertEquals(expected, actual);
		
	
		
	}

}
