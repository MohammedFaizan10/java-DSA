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
13        int size = 0;
14        ListNode temp = head;
15        while(temp != null){
16            size++;
17            temp = temp.next;
18        }
19        int arr[] = new int[size];
20        int i = 0;
21        for(ListNode curr = head ; curr != null ; curr = curr.next){
22            arr[i] = curr.val;
23            i++;
24        }
25        Arrays.sort(arr);
26        ListNode curr = head;
27        for(i = 0 ; i < size ; i++){
28            curr.val = arr[i];
29            curr = curr.next;
30        }
31        return head;
32    }
33}