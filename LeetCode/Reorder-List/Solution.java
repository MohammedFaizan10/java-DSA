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
12    public ListNode mid(ListNode head){
13        ListNode slow = head;
14        ListNode fast = head;
15        while(fast != null && fast.next != null){
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19        return slow;
20    }
21    public void reorderList(ListNode head) {
22        ListNode midnode = mid(head);
23        if(head == null){
24            return;
25        }
26        if(head.next == null){
27            return;
28        }
29        
30
31        ListNode prev = null;
32        ListNode curr = midnode.next;
33        midnode.next = null;
34        ListNode next;
35        while(curr != null){
36            next = curr.next;
37            curr.next = prev;
38            prev = curr;
39            curr = next;
40        }
41
42        ListNode left = head;
43        ListNode right = prev;
44        ListNode nextLeft;
45        ListNode nextRight;
46        while(left != null && right != null){
47            nextLeft = left.next;
48            left.next = right;
49            nextRight = right.next;
50            right.next = nextLeft;
51            left = nextLeft;
52            right = nextRight;
53        }
54    }
55}