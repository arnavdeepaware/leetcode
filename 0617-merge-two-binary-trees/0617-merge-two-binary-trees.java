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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        /*
            - In order traversal
            - check for null, if null, return the other root
            - if not null, create a new node, assign sum of roots
            - recurse on children nodes
            - return new node created
        */

        if(root1 == null){
            return root2;
        }

        if(root2 == null){
            return root1;
        }

        //At this point, both roots have values
        TreeNode ans = new TreeNode(root1.val + root2.val);

        //Recurse to Children
        ans.left = mergeTrees(root1.left, root2.left);
        ans.right = mergeTrees(root1.right, root2.right);

        //return ans node
        return ans;
        
    }
}