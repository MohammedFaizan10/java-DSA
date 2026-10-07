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
12    public static ListNode middleNode(ListNode head){
13        ListNode slow = head;
14        ListNode fast = head.next;
15        while(fast != null && fast.next != null){
16            slow = slow.next;   // +1
17            fast = fast.next.next;  // +2
18        }
19        return slow;
20    }
21
22    public static ListNode merge(ListNode head1, ListNode head2){
23        ListNode dummy = new ListNode(-1);
24        ListNode temp = dummy;
25        while(head1 !=  null && head2 != null){
26            if(head1.val < head2.val){
27                temp.next = head1;
28                head1 = head1.next;
29                temp = temp.next;
30            }
31            else{
32                temp.next = head2;
33                head2 = head2.next;
34                temp = temp.next;
35            }
36        }
37        //remaining in head1
38
39        while(head1 != null){
40            temp.next = head1;
41            head1 = head1.next;
42            temp = temp.next;
43        }
44
45        // remaining in head2
46
47        while(head2 != null){
48            temp.next = head2;
49            head2 = head2.next;
50            temp = temp.next;
51        }
52
53        return dummy.next;
54    }
55    public ListNode sortList(ListNode head) {
56         if(head == null || head.next == null){
57            return head;
58        }
59        //find mid
60
61        ListNode mid = middleNode(head);
62
63        // 1st half and 2nd half 
64        ListNode rightHalf = mid.next;
65        mid.next = null;
66
67        ListNode head1 = sortList(head);
68        ListNode head2 = sortList(rightHalf);
69
70        // merge two list 
71        return merge(head1,head2);
72    }
73}
74