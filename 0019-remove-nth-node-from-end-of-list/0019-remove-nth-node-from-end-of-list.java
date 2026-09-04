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
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size == n){
            return head.next;
        }

        temp = head;   // reset
        int i = 1;

        while(i < size - n ){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}