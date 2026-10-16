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
    public ListNode removeNodes(ListNode head) {
        if(head == null){
            return head;
        }
        
        Stack<Integer> s1 = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int current = 0;
        for(int i = 0 ; i < list.size() ; i++){
            current = list.get(i);
            while(!s1.isEmpty() && s1.peek() < current){
                s1.pop();
            }
            s1.push(current);
        }

        ListNode curr = head;
        ListNode prev = null;
        while(!s1.isEmpty()){
            curr.val = s1.pop();
            prev = curr;
            curr = curr.next;
            
        }
        prev.next = null;

        return reverse(head);
    }


    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    
}