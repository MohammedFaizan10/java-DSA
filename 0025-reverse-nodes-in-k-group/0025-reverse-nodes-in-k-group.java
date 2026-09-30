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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        ListNode prevLeft = null;
        ListNode res = null;
        while(true){
            int size = k;
            for(int i = 0 ; i < (size-1) ; i++){
                if(right == null){
                    break;
                }
                right = right.next;
            }
            if(right != null){

                ListNode leftNext = right.next;

                ListNode curr = left;
                ListNode prev = null;
                ListNode next = null;
                while(size >0 && curr != null){
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                    size--;
                }

                if(prevLeft != null){
                    prevLeft.next = right;
                }

                if(res == null){
                    res = right;
                }

                prevLeft = left;

                left = leftNext;
                right= leftNext;

            }
            else{
                if(prevLeft != null){
                    prevLeft.next = left;
                }

                if(res == null){
                    res = left;
                }
                break;
            }
        }
        return res;
    }
}