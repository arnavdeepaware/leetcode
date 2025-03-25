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
        if(root == null){
            return null;
        }

        Queue<Node> pq = new LinkedList<>();
        Queue<Node> children = new LinkedList<>();

        pq.offer(root);

        while(!pq.isEmpty()){

            int n = pq.size(); //Current level size

            for(int i = 0; i < n; i++){
                Node curr = pq.poll();

                //Update next pointer
                if(i == n-1){
                    curr.next = null;
                } else{
                    curr.next = pq.peek();
                }

                //Add children to queue
                if(curr.left != null){
                    pq.offer(curr.left);
                }

                if(curr.right != null){
                    pq.offer(curr.right);
                }
            }
        }

        return root;
        
    }
}