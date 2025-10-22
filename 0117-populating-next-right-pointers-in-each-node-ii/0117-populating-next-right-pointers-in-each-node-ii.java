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

        //Level Order Traversal
        if(root == null) return null;

        //add root to queue
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        //Traverse until all nodes are traversed
        while(!q.isEmpty()){
            
            int s = q.size();
            for(int i = 0; i < s; i++){

                Node curr = q.poll();

                //Set next pointer
                if(i < s-1){
                    curr.next = q.peek();
                }

                //Add children to q
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }

        }

        //return root after populating next pointers
        return root;
    }
}