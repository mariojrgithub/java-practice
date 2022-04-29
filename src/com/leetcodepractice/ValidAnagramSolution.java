package com.leetcodepractice;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramSolution {
	
	public static boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		if(s.equals(t)) {
			return true;
		}
		
		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			sMap.merge(s.charAt(i), 1, (a, b)->Integer.sum(a, b));
			tMap.merge(s.charAt(i), 1, (a, b)->Integer.sum(a, b));
		}
		
		for(Character c : sMap.keySet()) {
			if(!sMap.get(c).equals(tMap.get(c))) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {

		String s = "anagram";
		String t = "nagaram";
		
		boolean result = isAnagram(s, t);
		
		System.out.println(result);

	}

}
