package testcases;
import myClass.*;
import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		MyClass func3 = new MyClass();
		int value = 4;
		int result3 = func3.countA("A beautiful city Oshawa");
		assertEquals(value,result3);
	}

}
