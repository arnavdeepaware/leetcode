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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if(root == null){
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> nodesList = new LinkedList<>();
        nodesList.offer(root);

        LinkedList<Integer> level = new LinkedList<>();
        boolean isLeft = true;

        while(nodesList.size() > 0){
            int n = nodesList.size();

            for(int i = 0; i < n; i++){
                TreeNode curr = nodesList.poll();
                if(isLeft) level.addLast(curr.val);
                else level.addFirst(curr.val);

                if(curr.left != null) nodesList.offer(curr.left);
                if(curr.right != null) nodesList.offer(curr.right);
            }

            res.add(level);
            level = new LinkedList<>();
            isLeft = !isLeft;
        }

        return res;
    }
}