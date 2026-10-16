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
        // l1 = reverse(l1);
        // l2 = reverse(l2);
        Stack<Integer> s1 = new Stack<>();
        ListNode temp = l1;
        while(temp != null){
            s1.push(temp.val);
            temp = temp.next;
        }
        Stack<Integer> s2 = new Stack<>();
        temp = l2;
        while(temp != null){
            s2.push(temp.val);
            temp = temp.next;
        }

        ListNode head = null;   // reversing
        
        
        int carry = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            int sum = carry;
            if(!s1.isEmpty()){
                sum += s1.pop();
                
            }
            if(!s2.isEmpty()){
                sum += s2.pop();
                
            }
            
            carry = sum/10;
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
           

        }

        return head;

    }

    // public ListNode reverse(ListNode head){
    //     ListNode curr = head;
    //     ListNode prev = null;
    //     ListNode next = null;
    //     while(curr != null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     return prev;
    // }
}