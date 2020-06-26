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
    ArrayList<Integer> list = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        StringBuffer sp = new StringBuffer("");
        call(root,sp);
        int sum=0;
        for(int i : list)
            sum+= i;
        
        return sum;
    }
    
    public void call(TreeNode root,StringBuffer sp)
    {
        if(root==null)
            return;
        else if(root.left==null && root.right==null)
        {
            sp.append(root.val+"");
            list.add(Integer.parseInt(sp.toString()));
            return;
        }
        else if(root.left!=null && root.right==null)
        {
            sp.append(root.val+"");
            call(root.left,sp);
        }
        else if(root.left==null && root.right!=null)
        {
            sp.append(root.val+"");
            call(root.right,sp);
        }
        else
        {
            sp.append(root.val+"");
            StringBuffer sp2 = new StringBuffer(sp);
            call(root.left,sp);
            call(root.right,sp2);
        }
    }
}