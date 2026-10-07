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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = midNode(head);
        ListNode rightHalf = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        ListNode right= sortList(rightHalf);

        return merge(left,right);

    }

    public ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode p1 , ListNode p2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                temp.next = p1;
                p1 = p1.next;
            }
            else{
                temp.next = p2;
                p2 = p2.next;
            }
            temp = temp.next;
        }
        while(p1 != null){
            temp.next = p1;
            p1 = p1.next;
            temp = temp.next;
        }
        while(p2 != null){
            temp.next = p2;
            p2 = p2.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}