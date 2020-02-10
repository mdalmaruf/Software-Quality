package myClass;

import java.util.StringTokenizer;

public class TestCoverage {
	// method that returns maximum number
	public static int findMax(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				if (max == 0 || arr[i] > max) {
					max = arr[i];
				}
			} else {
				if (max < arr[i])
					max = arr[i];
			}

		}
		return max;
	}

	// method that returns cube of the given number
	public static int cube(int n) {
		return n * n * n;
	}

	// method that returns reverse words
	public static String reverseWord(String str) {

		StringBuilder result = new StringBuilder();

		// print reversed String

		StringTokenizer tokenizer = new StringTokenizer(str, " ");

		while (tokenizer.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();

			result.append(sb);
			result.append(" ");
		}
		
		return result.toString().trim();
	}

//	public static void main(String[] args) {
//		int y[] = { -12, -3, -4, -2 };
//
//		int x = findMax(y);
//		System.out.println(x);
//
//		String st = reverseWord("Hello world");
//		System.out.println(st);
//	}

}