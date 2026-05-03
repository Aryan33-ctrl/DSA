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
    public int goodNodes(TreeNode root) {

        return dfs(root,root.val);        
    }
    private int dfs(TreeNode node,int maxval){
        if(node==null){
            return 0;

        }
        int res=0;
        if(node.val>=maxval){
            res=1;
        }else{
            res=0;
        }
        maxval=Math.max(maxval,node.val);
        res+=dfs(node.left,maxval);
        res+=dfs(node.right,maxval);
        return res;
    }
}