/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {

        Stack<ImmutableListNode> st = new Stack<>();

        st.push(head);

        while(head.getNext() != null){
            head = head.getNext();
            st.push(head);
        }

        while(!st.empty()){
            st.pop().printValue();
        }
        
        return;
    }
}