/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        return helper(root, null);

    }

    public Node helper(Node root, Node next){
        if(root == null) return null;

        root.next = next;
        helper(root.left, root.right);
        
        if(root.next == null){
            helper(root.right, null);
        }else{
            helper(root.right, root.next.left);
        }

        return root;
    }
}