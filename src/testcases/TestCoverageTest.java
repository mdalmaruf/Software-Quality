package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import myClass.TestCoverage;

public class TestCoverageTest {

	@Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,TestCoverage.findMax(new int[]{1,3,4,2}));  
        
    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,TestCoverage.cube(3));  
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk",TestCoverage.reverseWord("my name is khan"));  
    }  

}
