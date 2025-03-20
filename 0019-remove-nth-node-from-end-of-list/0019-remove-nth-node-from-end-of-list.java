/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        /*
            - Will the node to be deleted always exist?
            - It could be head of the list or tail?
            - empty input?

            - Stack? 
            - Two Pointers?
            
            Stack will need one full pass and extra space
            Two pointers can be done in one pass

            - Declare a forward and curr pointers, starting at head
            - Move the forward pointers n times
            - After n times, we move both pointers till forward reaches end of list
                -   At this point, the node to be removed is the node after our curr pointer
                -   We can remove simply remove it by pointing curr to next.next
                - This will handle removing tail 
                - For head, there is a special case
                        - After n traversals, our forward pointer will be null 
                        - We simply return head.next
        */

        //Pointers
        ListNode forward = head;
        ListNode curr = head;

        //Move forward pointer n times
        for(int i = 0; i < n; i++){
            forward = forward.next;
        }

        //Check the edge case for head
        if(forward == null){
            return head.next;
        }

        //Traverse both pointers until forward reaches the last node
        while(forward.next != null){
            forward = forward.next;
            curr = curr.next;
        }

        //Remove the desried node
        curr.next = curr.next.next;

        //Return head of updated list
        return head;
        
    }
}