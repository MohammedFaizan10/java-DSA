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
12    public ListNode swapPairs(ListNode head) {
13        if(head == null){
14            return null;
15        }
16        ListNode left = head;
17        ListNode right = head;
18        ListNode prevLeft = null;
19        ListNode res = null;
20        
21        while(true){
22            int times = 1;
23            while(times > 0){
24                if(right == null){
25                    break;
26                }
27                right = right.next;
28                times--;
29            }
30            if(right != null){
31                ListNode leftnext = right.next;
32                
33                times = 2;
34                ListNode curr = left;
35                ListNode prev = null;
36                ListNode next = null;
37                while(times > 0 && curr != null){
38                    next = curr.next;
39                    curr.next = prev;
40                    prev = curr;
41                    curr = next;
42                    times--;
43                }
44                if(prevLeft != null){
45                    prevLeft.next = right;
46                }
47                
48
49                if(res == null){
50                    res = right;
51                }
52
53                prevLeft = left;
54
55                
56                left = leftnext;
57                right = leftnext;
58            }
59            else{
60                if(prevLeft != null){
61                    prevLeft.next = left;
62
63                }
64                if(res == null){
65                    res = left;
66                }
67                break;
68            }
69
70        }
71        return res;
72    
73    }
74}