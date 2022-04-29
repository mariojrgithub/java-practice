package com.java.collections;

public class CompressStringSolution {

	public static String compressString(String str) {
		// create StringBuffer to modify as the compressed string
		StringBuffer compressed = new StringBuffer();
		
		// convert input into char array
		char[] strAsChar = str.toCharArray();
		
		// hold the last char seen, initialize with first character
		char lastSeen = strAsChar[0];
		
		// initialize counter
		int count = 1;
		
		// loop through array starting at index 1
		for(int i = 1; i < strAsChar.length; i++) {
			
			// check if the next character is the same as lastSeen
			if(strAsChar[i] == lastSeen) {
				count++;
			} else {
				compressed.append(lastSeen + String.valueOf(count));
				lastSeen = strAsChar[i];
				count = 1;
			}
		}
		
		compressed.append(lastSeen + String.valueOf(count));
		
		// check if compressed string is smaller than the original
		if(compressed.toString().length() <= str.length()) {
			return compressed.toString();
		} else {
			return str;
		}
		
	}
	
	public static void main(String[] args) {

		String str = "aabcccccaaa";
		
		String result = compressString(str);
		
		System.out.println(result);
		
	}

}
