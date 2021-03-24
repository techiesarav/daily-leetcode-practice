package leetcode;

import java.util.Stack;

import utility.Pair;
import utility.TreeNode;

public class MaxDepthTree {
	
	 public int maxDepth(TreeNode root) {
	        
	        if(root==null) {
	            return 0;
	        }
	        
	        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
	        stack.push(new Pair(root, 1));
	        
	        int maxDepth = 0;
	        while(!stack.isEmpty()) {

	            Pair<TreeNode, Integer> pair = stack.pop();
	            TreeNode node = pair.key;
	            int currDepth = pair.value;
	            
	            maxDepth = Math.max(maxDepth, currDepth);
	            
	            if(node.left!=null) {
	                stack.push(new Pair(node.left, currDepth+1));
	            }
	            
	            if(node.right!=null) {
	                stack.push(new Pair(node.right, currDepth+1));
	            }  
	        }
	        
	        return maxDepth;
	    }

	public static void main(String[] args) {
		MaxDepthTree maxDepth = new MaxDepthTree();
		TreeNode root = new TreeNode(3);
    	root.left = new TreeNode(9);
    	root.right = new TreeNode(20);
    	root.right.left = new TreeNode(15);
    	root.right.right = new TreeNode(7);
    	maxDepth.maxDepth(root);
	}

}
