package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import utility.TreeNode;



public class LevelTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
          if(root == null)
              return ans;
          queue.add(root);
          while(!queue.isEmpty()){
              int size = queue.size();
              List<Integer> integerList = new ArrayList<>();
              for(int i=0;i<size;i++){
                  TreeNode node =queue.poll();
                  integerList.add(node.val);
                  if(node.left !=null){
                      queue.add(root.left);
                  }
                  if(node.right !=null){
                      queue.add(root.right);
                  }
              }
              ans.add(integerList);
          }
          return ans;
      }
    
    public static void main(String[] args) {
    	LevelTraversal lTraversal = new LevelTraversal();
    	TreeNode root = new TreeNode(3);
    	root.left = new TreeNode(9);
    	root.right = new TreeNode(20);
    	root.right.left = new TreeNode(15);
    	root.right.right = new TreeNode(7);
    	lTraversal.levelOrder(root);
    }
}
