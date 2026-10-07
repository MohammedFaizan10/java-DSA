1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13        ArrayList<Integer> arr = new ArrayList<>();
14        
15        for(int i = 0 ; i < lists.length ; i++){
16            ListNode curr = lists[i];
17
18            while(curr != null){
19                arr.add(curr.val);
20                curr = curr.next;
21            }
22        }
23
24        Collections.sort(arr);
25
26        ListNode dummy = new ListNode(-1);
27        ListNode tail = dummy;
28
29        for(int i = 0 ; i < arr.size() ; i++){
30            tail.next = new ListNode(arr.get(i));
31            tail = tail.next;
32        }
33
34        return dummy.next;
35    }
36}