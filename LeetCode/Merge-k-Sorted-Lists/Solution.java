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
13        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
14
15        for(ListNode node : lists){
16            if(node != null){
17                pq.add(node);
18            }
19        }
20
21        ListNode dummy = new ListNode(0);
22        ListNode temp = dummy;
23        while(!pq.isEmpty()){
24            ListNode node = pq.poll();
25            temp.next = node;
26            temp = temp.next;
27
28            if(node.next != null){
29                pq.add(node.next);
30            }
31        }
32
33        return dummy.next;
34        
35    }
36}