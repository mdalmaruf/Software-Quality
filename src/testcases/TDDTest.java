package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import myClass.TDD;

public class TDDTest {
    // For a given string,
		//Problem 1. Swap the last two characters of the string 
	//   [""=>"", "A" => "A", "AM"=>"MA", "ABCD" => "ABDC"]
	
	
	
		//Problem 2. Remove 'A' if it is present in the first two charcters of the string
	
	
	
	
	@Test
	public void swapTest2Char() {
		TDD str = new TDD();
		
		assertEquals("BA", str.swap("AB"));
	}
	
	@Test
	public void swapTestMultiChar() {
		TDD str = new TDD();
		assertEquals("ABDC", str.swap("ABCD"));
	}
	
	@Test
	public void swapTest1Char() {
		TDD str = new TDD();
		assertEquals("A", str.swap("A"));
	}
	
	@Test
	public void swapTestEmpty() {
		TDD str = new TDD();
		assertEquals("", str.swap(""));
	}
	
}
