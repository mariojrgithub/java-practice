package com.java.collections;

public class MagicIndexSolution {
	
	
	// brute force search
	public static int findMagicIndex(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == i) {
				return i;
			}
		}
		return -1;
	}
	
	// Print all subsets of given set[]
	// found on geeks for geeks
    static void printSubsets(char set[]) {
        int n = set.length;
 
        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++) {
            System.out.print("{ ");
 
            // Print current subset
            for (int j = 0; j < n; j++)
 
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
 
            System.out.println("}");
        }
    }

    
    
	public static void main(String[] args) {

		int[] firstArray = new int[] {0, 1, 2, 3, 4};
		int[] secondArray = new int[] {1, 3, 4, 5, 5, 6, 6};
		
		int result1 = findMagicIndex(firstArray);
		int result2 = findMagicIndex(secondArray);
		
		System.out.println(result1);
		System.out.println(result2);
		
		int n = 4;
		
		System.out.println(1<<n);
	}

}
