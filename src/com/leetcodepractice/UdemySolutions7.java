package com.leetcodepractice;

import java.util.Arrays;

public class UdemySolutions7 {
	
	// transpose a matrix
	public static int[][] transpose(int[][] A){
		int r = A.length;
		int c = A[0].length;
		
		int[][] transpose = new int[c][r];
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				transpose[j][i] = A[i][j];
			}
		}
		
		return transpose;
	}
	
	// binary search on a sorted array
	public static int binarySearch(int[] nums, int target) {
		if(nums == null || nums.length == 0) {
			return -1;
		}
		
		int left = 0;
		int right = nums.length -1;
		
		// loop through until indexes are the same
		while(left <= right) {
			// find midpoint
			int mid = left + (right - left) / 2;
			// check if value at mid is the target
			if(nums[mid] == target) {
				return mid;
			}
			// if value at mid is greater than target, move right index 1 to the left 
			if(nums[mid] > target) {
				right = mid - 1;
			} else {
				// if value at mid is less than target, assign left index to mid + 1
				left = mid + 1;
			}
		}
		// if the target isn't found return -1
		return -1;
		
	}
	
	// plus one to end of array
	public static int[] plusOne(int[] digits) {
		// loop through array from the end
		for(int i = digits.length - 1; i >= 0; i--) {
			// if the digit is less than 9, increase value and return the array
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			} else {
				// if greater than 9 insert a zero
				digits[i] = 0;
			}
		}
		// to handle arrays like [9,9,9,9]
		int[] nums = new int[digits.length + 1];
		nums[0] = 1;
		
		return nums;
	
	}
	
	

	public static void main(String[] args) {

		int[][] A = new int[][] { {1,2,3}, {4,5,6} };
		
		int[] nums = new int[] {-1, 0, 3, 5, 9, 12, 17, 21, 27, 34, 41};
		int target = 3;
		
		int[] digits1 = new int[] {1, 1, 0};
		int[] digits2 = new int[] {9, 9, 9, 9};
		
		float[] digits3 = new float[] {5, 9, 3, 1, 2};
		Arrays.sort(digits3);
		
		// transpose
		System.out.println(Arrays.deepToString(transpose(A)));
		
		// binary search
		System.out.println(binarySearch(nums, target));
		
		// plus one
		System.out.println(Arrays.toString(plusOne(digits1)));
		System.out.println(Arrays.toString(plusOne(digits2)));
		
		System.out.println(Arrays.toString(digits3));
	}

}
