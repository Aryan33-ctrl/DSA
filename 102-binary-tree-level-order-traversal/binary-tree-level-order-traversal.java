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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        helper(root,0,result);
        return result;

        
        }
        
    

    private void helper(TreeNode node,int level,List<List<Integer>>result){
        if(node==null)return;

        if(result.size()==level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        helper(node.left,level+1,result);
        helper(node.right,level+1,result);
    }
}