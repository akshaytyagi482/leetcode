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
    public boolean isSymmetric(TreeNode root) {
       return mirror(root.left,root.right); 
    }
    public boolean mirror(TreeNode root,TreeNode toor){
       if(root == null && toor == null) return true;
       if(root == null || toor == null) return false;
       return (root.val == toor.val) && mirror(root.left,toor.right) && mirror(root.right,toor.left);
    }
}