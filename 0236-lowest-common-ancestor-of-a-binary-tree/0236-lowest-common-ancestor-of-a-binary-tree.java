/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    TreeNode ansNode;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            this.helper(root, p, q);
            return this.ansNode;
    }

    public boolean helper(TreeNode root, TreeNode p, TreeNode q){
        //Leaf or Null Node
        if(root == null){
            return false;
        }

        //Traversal
        int r = helper(root.right, p, q) ? 1:0;
        int l = helper(root.left, p, q) ? 1:0;
        int m = (root == p || root == q) ? 1:0;

        //Check if curr node is the ansNode
        if(r + m + l >= 2) this.ansNode = root;

        return (r + m + l > 0);
    }
}