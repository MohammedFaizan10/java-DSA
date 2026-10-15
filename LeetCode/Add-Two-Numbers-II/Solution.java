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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        l1 = reverse(l1);
14        l2 = reverse(l2);
15
16        ListNode dummy = new ListNode(0);
17        ListNode curr = dummy;
18        
19        int carry = 0;
20        while(l1 != null || l2 != null || carry != 0){
21            int sum = carry;
22            if(l1 != null){
23                sum += l1.val;
24                l1 = l1.next;
25            }
26            if(l2 != null){
27                sum += l2.val;
28                l2 = l2.next;
29            }
30
31            curr.next = new ListNode(sum % 10);
32            carry = sum/10;
33            curr = curr.next;
34
35        }
36
37        return reverse(dummy.next);
38
39    }
40
41    public ListNode reverse(ListNode head){
42        ListNode curr = head;
43        ListNode prev = null;
44        ListNode next = null;
45        while(curr != null){
46            next = curr.next;
47            curr.next = prev;
48            prev = curr;
49            curr = next;
50        }
51
52        return prev;
53    }
54}