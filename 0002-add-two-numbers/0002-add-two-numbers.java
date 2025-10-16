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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode curr = head;

        int carryOver = 0;

        while(l1 != null && l2!= null){
            int sum  = l1.val + l2.val + carryOver;
            int digit  = sum % 10;
            carryOver = sum / 10;

            curr.next = new ListNode(digit); 

            //move pointers
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }

         while(l1 != null){
            int sum  = l1.val + carryOver;
            int digit  = sum % 10;
            carryOver = sum / 10;

            curr.next = new ListNode(digit); 

            //move pointer
            l1 = l1.next;
            curr = curr.next;
        }

        while(l2 != null){
            int sum  = l2.val + carryOver;
            int digit  = sum % 10;
            carryOver = sum / 10;

            curr.next = new ListNode(digit); 
            

            //move pointer
            l2 = l2.next;
            curr = curr.next;
        }

        if(carryOver == 1) curr.next = new ListNode(1);

        return head.next;

        
        
    }
}