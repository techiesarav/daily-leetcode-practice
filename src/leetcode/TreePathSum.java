package leetcode;

/**
 * 
 * https://leetcode.com/problems/path-sum/
 * @author sramasamy7446
 *
 */
public class TreePathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(8);
		root.left.left = new Node(11);
		root.left.left.left = new Node(6);
		root.left.left.right = new Node(2);
		root.right.left = new Node(13);
		root.right.right = new Node(4);
		root.right.right.right = new Node(1);
		System.out.println(hasPathSum(root,22));

	}

	public static boolean hasPathSum(Node root, int sum) {
		int res = 0;
		return checkSum(root,sum,res);
	}

	public static boolean checkSum(Node root,int sum,int res){
			if (root == null) {
		        return false;
		    }
		    
		    if (sum == root.val && root.left == null && root.right == null) {
		        return true;
		    }
		    
		    return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		    }

}

class Node {
	int val;
	Node left;
	Node right;
	Node() {}
	Node(int val) { this.val = val; }
	Node(int val, Node left, Node right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
