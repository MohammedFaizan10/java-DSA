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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(curr != null){
            ListNode temp = curr.next;
            int greater = 0;
            while(temp != null){
                if(temp.val > curr.val){
                    greater = temp.val;
                    break;
                }
                temp = temp.next;


            }
            list.add(greater);
            curr = curr.next;
        }

        int res[] = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            res[i] = list.get(i);
        }

        return res;
    }
}