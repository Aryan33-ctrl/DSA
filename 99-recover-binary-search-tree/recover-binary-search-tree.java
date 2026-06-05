class Solution {

    TreeNode first;
    TreeNode second;
    TreeNode prev;

    public void recoverTree(TreeNode root) {

        first = null;
        second = null;
        prev = new TreeNode(Integer.MIN_VALUE);

        inorder(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        if (prev.val > root.val) {

            if (first == null) {
                first = prev;
            }

            second = root;
        }

        prev = root;

        inorder(root.right);
    }
}