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
    public int deepestLeavesSum(TreeNode root) {
       Queue<TreeNode> q=new ArrayDeque<>();
       q.offer(root);

       int sum=0;

       while(!q.isEmpty()){
          int size=q.size();

          sum=0;

          for(int i=0;i<size;i++){
            TreeNode n=q.poll();

            sum+=n.val;

            if(n.left!=null){
                q.offer(n.left);
            }
            if(n.right!=null){
                q.offer(n.right);
            }
          }
       }
       return sum;
    }
}