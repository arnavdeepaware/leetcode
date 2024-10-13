/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    private TreeNode helper(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int mid = -1;
        for (int i = l; i <= r; i++) {
            if (nums[i] > max) {
                max = nums[i];
                mid = i;
            }

        }

        TreeNode root = new TreeNode(max);
        root.left = helper(nums, l, mid - 1);
        root.right = helper(nums, mid + 1, r);

        return root;
    }
}