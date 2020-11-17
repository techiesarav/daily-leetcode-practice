package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
 * @author sramasamy7446
 *
 */
public class TraverseBST {
	
	 class TreeNode2 {
	      int val;
	      TreeNode2 left;
	      TreeNode2 right;
	      TreeNode2() {}
	      TreeNode2(int val) { this.val = val; }
	      TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	
	 public static List<Integer> getAllElements(TreeNode2 root1, TreeNode2 root2) {
	        
	        Comparator<Integer> ascComparator = (o1,o2) -> o1 -o2;
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10000
	                                ,ascComparator);
	        
	        traverseInorder(pq,root1);
	        traverseInorder(pq,root2);
	        List<Integer> resultList = new ArrayList<>();
	        while(!pq.isEmpty()){
	            resultList.add(pq.poll());
	        }
	        return resultList;
	    }
	    
	    public static void  traverseInorder(PriorityQueue<Integer> pq,TreeNode2 root1){
	        if(root1.left != null){
	            traverseInorder(pq,root1.left);
	        }
	        pq.add(root1.val);
	        if(root1.right != null){
	            traverseInorder(pq,root1.right);
	        }
	    }

	public static void main(String[] args) {
		TraverseBST t1 = new TraverseBST();
		TreeNode2 root1 = t1.new TreeNode2(2);
		root1.left = t1.new TreeNode2(1);
		root1.right = t1.new TreeNode2(4);
		TreeNode2 root2 = t1.new TreeNode2(1);
		root2.left = t1.new TreeNode2(0);
		root2.right = t1.new TreeNode2(3);
		getAllElements(root1,root2);
		System.out.println("Method Ends--");
	}

}



 
 


