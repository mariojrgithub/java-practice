package com.leetcodepractice;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathSolution {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(){};
		TreeNode(int val){
			this.val = val;
		}
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	
	
	List<String> answer = new ArrayList<String>();
	
	public List<String> binaryTreePaths(TreeNode root){
		
		
		if(root != null) {
			searchBT(root, "");
		}
		
		return answer;
	}

	private void searchBT(TreeNode node, String path) {
		if(node == null) {
			return;
		}
		
		if(node.left == null && node.right == null) {
			answer.add(path + node.val);
		}
		
		String p = path + node.val + "->";
		searchBT(node.left, p);
		searchBT(node.right, p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
