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
13        int interval = 1;
14        int n = lists.length;
15        if(lists.length == 0){
16            return null;
17        }
18        while(interval < n){
19            for(int i = 0 ; i + interval < n ; i += interval*2){
20                lists[i] = merge(lists[i] , lists[i + interval]);
21            }
22            interval = interval*2;
23        }
24
25        return lists[0];
26        
27    }    
28
29    public ListNode merge(ListNode l1 , ListNode l2){
30        if(l1 == null) return l2;
31        if(l2 == null) return l1;
32        if(l1.val <= l2.val){
33            ListNode res = l1;
34            res.next = merge(l1.next,l2);
35            return res;
36        }
37        else{
38            ListNode res = l2;
39            res.next = merge(l1,l2.next);
40            return res;
41        }
42    }
43}