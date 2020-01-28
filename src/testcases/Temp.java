package testcases;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Temp {

	@Test
	public void testAddGet1() {
		ArrayList list = new ArrayList();
		list.add(42);
		list.add(-3);
		list.add(15);
		assertEquals(42, list.get(0));
		assertEquals(-3, list.get(1));
		assertEquals(15, list.get(2));
	}

	@Test
	public void testIsEmpty() {
		ArrayList list = new ArrayList();
		assertTrue(list.isEmpty());
		list.add(123);
		assertFalse(list.isEmpty());
		list.remove(0);
		assertTrue(list.isEmpty());
	}

}
