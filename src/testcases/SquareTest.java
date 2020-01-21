package testcases;
import myClass.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		MyClass func2 = new MyClass();
		int value = 100;
		int result2 = func2.square(10);
		assertEquals(value,result2);
		
//		fail("Not yet implemented");
	}

}
