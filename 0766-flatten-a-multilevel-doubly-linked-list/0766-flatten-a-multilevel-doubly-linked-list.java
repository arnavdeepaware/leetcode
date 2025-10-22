/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        //edge case
        if(head == null) return null;

        //temp head
        Node temp = new Node();
        temp.next = head;

        //Call dfs function
        flattenList(temp, head);
        
        //return head
        temp.next.prev = null;
        return temp.next;
    }

    //DFS function
    public Node flattenList(Node prev, Node curr){
        
        //Edge case
        if(curr == null) return prev;

        //Change pointer for current node
        curr.prev = prev;
        prev.next = curr;

        //Stores the next node on same level
        Node levelNext = curr.next;

        //returns tail of the level below
        Node tail = flattenList(curr, curr.child);
        curr.child = null;  //remove child pointer

        //move onto next node with tail as prev and tempNext as curr
        return flattenList(tail, levelNext);
    }
}