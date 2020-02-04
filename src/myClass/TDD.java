package myClass;

public class TDD {

	public String swap(String str) {
//		AB =>BA
//		ABCD => ABDC
		
//		char first = str.charAt(0);		
//		char last = str.charAt(1);
//		return "" + last+first;
		
		
		int length = str.length();
		if(length<2) {
			return str;
		}
//		
		char secondlast = str.charAt(length-2);
		char last = str.charAt(length-1);
//		
		String subString = str.substring(0,length-2);
//		
		return subString + last + secondlast;
//	
		
		
	}
	
}
