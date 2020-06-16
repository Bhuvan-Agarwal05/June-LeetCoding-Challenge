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
    TreeNode ansRoot = null;
    public TreeNode searchBST(TreeNode root, int val) {
        find(root,val);
        return ansRoot;
    }
    
    private void find(TreeNode root,int value)
    {
        if(root==null)
            return;
        else
        {
            if(root.val==value)
                ansRoot = root;
            else if(root.val > value)
                find(root.left,value);
            else
                find(root.right,value);
            return;
        }
        
    }
    
}