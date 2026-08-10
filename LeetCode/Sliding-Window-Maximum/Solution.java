1class Solution {
2
3    public int[] maxSlidingWindow(int[] nums, int k) {
4        int n = nums.length;
5        int result[] = new int[n-k+1];
6        Deque<Integer> dq = new LinkedList<>();
7        for(int high = 0 ; high < n ; high++){
8
9            while(!dq.isEmpty() && dq.peekFirst() <= high - k){
10                dq.pollFirst();
11            }
12            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[high]){
13                dq.pollLast();
14            }
15            dq.addLast(high);
16            if(high >= k - 1){
17                result[high - k +1] = nums[dq.peekFirst()];
18            }
19
20        }
21
22        return result;
23    }
24}