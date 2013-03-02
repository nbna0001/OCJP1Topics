package com.nbna.stringmanuplation;

public class StringReversal {
	public static void main(String[] args) {
		String palindrome = "Dot saw I was Tod";
		
		int len = palindrome.length();
		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];

		// put original string in an
		// array of chars	

		// reverse array of chars
		for (int j = 0; j < len; j++) {
			charArray[j] =  palindrome.charAt(len - 1 - j);
		}

		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);
	}
}
