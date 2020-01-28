package myClass;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Quiz2 {
	
	public boolean gender_check(String gender) {
		
		if (gender=="F") {
			return true;  
		}else
			return false;	
	}  
	
	public String age_check(int age) {
		
		if(age > 45 && age < 60) {
			System.out.println("Eligible");
			return "Elgible";
		}else {
			return "Not Eligible";
		}
		
	}
	
	public String length_check(String username) {
		
		int length = username.length();
		if(length >= 6 && length <= 10) {
			System.out.println("Valid");
			return "Valid";
		}
		return "Invalid";
	}
	
	
}
