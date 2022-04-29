package com.leetcodepractice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumSolution {
	
	public static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				return new int[] {map.get(nums[i]), i};
			}
			
			map.put(target - nums[i], i);
			System.out.println(Arrays.asList(map));
		}
		
		return new int[0];
	}

	public static void main(String[] args) {

		int[] nums = new int[] {2, 1, 5, 3};
		int target = 4;
		
		int[] result = twoSum(nums, target);
		
		System.out.println(Arrays.toString(result));
	}

}
