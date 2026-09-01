1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16        while(fast != null && fast.next != null){
17            slow = slow.next;
18            fast = fast.next.next;
19            if(slow == fast){
20                slow = head;
21                while(slow != fast){
22                    slow = slow.next;
23                    fast = fast.next;
24                }
25                return slow;
26            }
27
28        }
29
30        // while(slow != fast){
31        //     slow = slow.next;
32        //     fast = fast.next;
33        // }
34        // return slow;
35        return null;
36
37
38    }
39}