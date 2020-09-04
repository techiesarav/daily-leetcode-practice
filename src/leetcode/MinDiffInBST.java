package leetcode;

  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
  
  class solution
  {
	  int max=0;
	    int diff=Integer.MAX_VALUE;
	    boolean flag=true;
	    public int minDiffInBST(TreeNode root)
	    {
	        if(root==null)
	            return 0;
	        minDiffInBST(root.left);
	        if(flag==false)
	            diff=Math.min(diff,root.val-max);
	        flag=false;
	        max=root.val;
	        minDiffInBST(root.right);
	        return diff;
	    }
  }

 public class MinDiffInBST {
	 
	 
 
	public static void main(String[] args) {
		solution s = new solution();
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		System.out.println(s.minDiffInBST(root));
	}
}
