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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        recursion(root1, list1);
        recursion(root2, list2);
        return list1.equals(list2);
    }
    private void recursion(TreeNode node, List<Integer> list) {
        if (node == null) return;
        if (node.right == null && node.left == null) {
            list.add(node.val);
            return;
        }
        recursion(node.right, list);
        recursion(node.left, list);
    }
}