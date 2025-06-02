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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {

        List<Integer> res = new ArrayList<>();

        Stack<Node> st = new Stack<>();
        Stack<Node> reverseSt = new Stack<>();

        if(root == null){
            return res;
        }
        
        st.push(root);

        while(!st.empty()){
            Node curr = st.pop();
            reverseSt.push(curr);

            for(Node child: curr.children){
                st.push(child);
            }
        }

        while(!reverseSt.empty()){
            res.add(reverseSt.pop().val);
        }

        return res;

    }
}