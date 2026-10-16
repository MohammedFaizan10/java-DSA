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
        
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int n = list.size();
        int res[] = new int[n];

        Stack<Integer> s1 = new Stack<>();
        for(int i = n-1; i >=0 ; i--){
            int current = list.get(i);
            while(!s1.isEmpty() && s1.peek() <= current){
                s1.pop();
            }
            if(!s1.isEmpty()){
                res[i] = s1.peek();
            }else{
                res[i] = 0;
            }

            s1.push(current);
        }

        return res;

    }
}