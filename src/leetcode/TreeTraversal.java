package leetcode;



public class TreeTraversal {
	
	static class TreeNode{
		TreeNode right;
		TreeNode left;
		int val;
		
		TreeNode(int val){
			this.val = val;
			this.right = null;
			this.left = null;
		}
	}
    
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
