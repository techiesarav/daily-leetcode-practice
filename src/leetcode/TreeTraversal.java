package leetcode;


  
   public class TreeNode {
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
 
class Solution {}

public class TreeTraversal {
	

    
    private static void inOrderTraversal(TreeNode root,TreeNode result){
        if(root.left !=null){
            inOrderTraversal(root.left,result);
        }
        result.right = new TreeNode(root.val);
        if(root.right !=null){
            inOrderTraversal(root.right,result);
        }
    }
    
    public static TreeNode increasingBST(TreeNode root) {
        TreeNode resultNode = null;
         inOrderTraversal(root,resultNode);
        return resultNode;
    }


	public static void main(String[] args) {
		TreeNode root = null;
		increasingBST(root );
	}

}
