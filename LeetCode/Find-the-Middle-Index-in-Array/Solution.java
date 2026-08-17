1class Solution {
2    public int findMiddleIndex(int[] nums) {
3        int n = nums.length;
4        int left = 0;
5        int right = 0;
6        int sum = 0;
7        for(int i = 0 ; i < n ; i++){
8            sum += nums[i];
9        }
10
11        if(sum == nums[0]){
12            return 0;
13        }
14
15        for(int i = 1 ; i < n ; i++){
16            left += nums[i-1];
17            right = sum - nums[i] - left;
18
19            if(left == right){
20                return i;
21            }
22        }
23
24        return -1;
25    }
26}