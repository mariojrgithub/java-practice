package com.microsoftjavabeginner;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringExampleOne {

	// char to String
	public static String charToString(char c) {
		return Character.toString(c);
	}

	// String to char
	public static char stringToChar(String str) {
		return str.charAt(0);
	}

	// String to char array
	public static char[] stringToCharUsingToCharArray(String str) {
		char[] chararray = str.toCharArray();

		for (char c : chararray) {
			System.out.println(c);
		}

		return chararray;
	}

	// String to char array using getChars()
	public static char[] stringToCharUsingGetChars(String str) {
		char[] chararray = new char[8];

		str.getChars(8, 16, chararray, 0);

		for (char c : chararray) {
			System.out.print(c + " ");
		}

		return chararray;
	}

	// String to Character array using chars()
	public static Character[] stringToCharsUsingChars(String str) {
		Character[] arraychars = str.chars()
									.mapToObj(c -> (char) c)
									.toArray(Character[]::new);

		for (Character c : arraychars) {
			if (Character.isLowerCase(c)) {
				System.out.print(c + " ");
			}
		}

		return arraychars;
	}

	// String array to String
	public static String arrayToStringUsingToString(String[] strarray) {
		String str = Arrays.toString(strarray);

		return str;
	}

	public static String arrayToStringUsingStringBuilderAndAppend(String[] strarray) {
		StringBuilder stringb = new StringBuilder();

		for (int i = 0; i < strarray.length; i++) {
			stringb.append(strarray[i] + " ");
		}

		return stringb.toString();
	}

	// using StringJoiner
	public static String arrayToStringUsingStringJoiner(String[] strarray) {
		StringJoiner stringj = new StringJoiner(";;;", "[", "]");

		for (int i = 0; i < strarray.length; i++) {
			stringj.add(strarray[i] + "/");
		}

		return stringj.toString();
	}

	// using Stream and Collectors
	public static String arrayToStringUsingStreamAndCollector(String[] strarray) {
		return Stream.of(strarray).collect(Collectors.joining());
	}

	// String to String array using split()
	public static String[] stringToArrayUsingSplit(String str) {
		String[] strarray = str.split(",");

		if (strarray.length > 0) {
			for (String elem : strarray) {
				System.out.print(elem + " ");
			}
		}

		return strarray;
	}

	// String to String array using a patter
	public static String[] stringToArrayUsingPatter(String str) {
		String splitpattern = "\\s\\s"; // 2 spaces
		Pattern pattern = Pattern.compile(splitpattern);
		String[] strarray = pattern.split(str);

		for (int i = 0; i < strarray.length; i++) {
			System.out.println("strarray[" + i + "]=" + strarray[i]);
		}

		return strarray;

	}
	
	// String to array using StringTokenizer
	public static String[] stringToArrayUsingTokenizer(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str, ",");
		String[] strarray = new String[tokenizer.countTokens()];
		
		// add tokens to our array
		int i = 0;
		while(tokenizer.hasMoreTokens()) {
			strarray[i] = tokenizer.nextToken();
			i++;
		}
		
		for(String stritem : strarray) {
			System.out.println(stritem);
		}
		
		return strarray;
	}
}
