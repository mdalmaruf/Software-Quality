package myClass;

import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;

public class FindBugs {
	
	
	/* Function 1: Missing the ‘break’ Keyword */
	public static void switchCasePrimer() {
    	int caseIndex = 0;
    	switch (caseIndex) {
        	case 0:
            	System.out.println("Zero");
        	case 1:
            	System.out.println("One");
            	break;
        	case 2:
            	System.out.println("Two");
            	break;
        	default:
            	System.out.println("Default");
    	}
	}
	
	
	/*Function 2: Forgetting to Free Resources*/
	public static void printFileJava7() throws IOException {
	    FileInputStream input = new FileInputStream("file.txt");
	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    
	}
	
	/*Function 3: Immutable String in Java*/
	public void garbage_collector() {
		String oneMillionHello = "";
		for (int i = 0; i < 1000000; i++) {
		    oneMillionHello = oneMillionHello + "Hello!";
		}
		System.out.println(oneMillionHello.substring(0, 6));
		
	}
	
	/*Function 4: Null pointer*/
	
	public void nullpointer_exp() {
		Person pp = new Person();
		String accountId = pp.getAccountId();
		if(accountId == "X001") {
		    System.out.println(accountId);
		}
	}
	
	/*Infinite loop*/

	public void infinte_loop() {
		boolean var =true;
		while(var) {
            System.out.println(var); 			
		}
		
	}
	
	
	
	
	
	/* Main function */
	public static void main(String[] args) {
		
	}

}
