package myClass;

public class MyClass {
	
	//function 1
	public static String concatenate(String one, String two){
        return one + two;
    }
	
	
	//function 2	
	public static int square (int x) {
		return x*x+1;
	}
	
	//function 3
	public static int countA(String word) {
		int count = 0;
		for(int index=0; index<word.length(); index++) {
			if(word.charAt(index)=='a' || word.charAt(index)=='A') {
				count++;
			}
		}
		return count;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String concat= concatenate("Hello", "Software");
		System.out.println("Function 1:" + " " +concat);
		
		int sqr= square(10);
		System.out.println("Function 2:" + " Square of 10 = " +sqr);
		
		
		int count= countA("A beautiful City Oshawa");
		System.out.println("Function 3:" + "A beautiful City Oshawa= Count(a/A)= " +count);
		
		
		

	}

}
