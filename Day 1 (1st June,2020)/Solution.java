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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        
        // Swap right subTree to left subTree and vice versa
        TreeNode rightSubTree = root.right;
        root.right = root.left;
        root.left = rightSubTree;
        
        // Now in a Recursive Way perform same operations on Left & Right Child
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    
}