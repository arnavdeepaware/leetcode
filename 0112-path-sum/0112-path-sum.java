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

    /*
        - Traverse the array and keep track of sum
        - If leaf node, check sum and return sum == target sum
        - Else,
            - Go to the right child
            - GO to the left child
    */


    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, 0);

    }

    //Helper function
    public boolean helper(TreeNode root, int target, int sum){
        //Edge Case
        if(root == null){
            return false;
        }

        sum += root.val;

        //Current node is leaf node
        if(root.left == null && root.right == null){
            return sum == target;
        }

        boolean right = helper(root.right, target, sum);
        return (right || helper(root.left, target, sum));

    }
}