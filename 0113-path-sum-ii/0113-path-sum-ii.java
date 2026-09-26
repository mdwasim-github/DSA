/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> path = new ArrayList<>();
      int sum =0;
      helper(root,path,res,sum,targetSum);
      return res;
    }
    public void helper(TreeNode root,List<Integer>path,List<List<Integer>>res,int sum,int targetSum){
        if(root== null) return ;
        path.add(root.val);
        sum+=root.val;
        if(root.left == null && root.right == null && sum==targetSum) res.add(new ArrayList<>(path));
        helper(root.left,path,res,sum,targetSum);
        helper(root.right,path,res,sum,targetSum);
        sum-=root.val;
        path.remove(path.size()-1);
        
    }
}