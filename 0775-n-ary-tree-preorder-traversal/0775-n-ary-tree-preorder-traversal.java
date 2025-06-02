/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {

        List<Integer> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Stack<Node> st = new Stack<>();

        st.push(root);

        while(!st.empty()){
            Node curr = st.pop();
            res.add(curr.val);
            System.out.println(curr.val);

            Collections.reverse(curr.children);

            for(Node child: curr.children){
                st.push(child);
            }
        }

        return res;
        
    }
}