package com.leetcodepractice;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicatesSolution {
	
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> numbers = new HashSet<Integer>();
		
		for(int num : nums) {
			if(numbers.contains(num)) {
				return true;
			}
			numbers.add(num);
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int[] nums = new int[] {1, 2, 3, 4};
		
		boolean result = containsDuplicate(nums);
		
		System.out.println(result);

	}

}
