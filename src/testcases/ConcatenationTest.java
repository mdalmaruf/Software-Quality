package testcases;

import myClass.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatenationTest {

	@Test
	public void test() {
		String message = "SOFE-3950";
		String result1 = MyClass.concatenate("SOFE-", "3950");
		assertEquals("concatenation results", message, result1);
	}

}
