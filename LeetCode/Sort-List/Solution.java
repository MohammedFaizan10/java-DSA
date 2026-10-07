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
12    public ListNode sortList(ListNode head) {
13        if(head == null || head.next == null){
14            return head;
15        }
16        ListNode mid = midNode(head);
17        ListNode rightHalf = mid.next;
18        mid.next = null;
19
20        ListNode left = sortList(head);
21        ListNode right= sortList(rightHalf);
22
23        return merge(left,right);
24
25    }
26
27    public ListNode midNode(ListNode head){
28        ListNode slow = head;
29        ListNode fast = head.next;
30
31        while(fast != null && fast.next != null){
32            slow = slow.next;
33            fast = fast.next.next;
34        }
35        return slow;
36    }
37
38    public ListNode merge(ListNode p1 , ListNode p2){
39        ListNode dummy = new ListNode(0);
40        ListNode temp = dummy;
41        while(p1 != null && p2 != null){
42            if(p1.val <= p2.val){
43                temp.next = p1;
44                p1 = p1.next;
45            }
46            else{
47                temp.next = p2;
48                p2 = p2.next;
49            }
50            temp = temp.next;
51        }
52        while(p1 != null){
53            temp.next = p1;
54            p1 = p1.next;
55            temp = temp.next;
56        }
57        while(p2 != null){
58            temp.next = p2;
59            p2 = p2.next;
60            temp = temp.next;
61        }
62
63        return dummy.next;
64    }
65}