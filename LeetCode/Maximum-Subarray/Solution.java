1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n = nums.length;
4        int bestEnding = 0;
5        int max = Integer.MIN_VALUE;;
6        for(int i = 0 ; i < n ; i++){
7            int v1 = bestEnding + nums[i];
8            int v2 = nums[i];
9            bestEnding = Math.max(v1,v2);
10            max = Math.max(max,bestEnding);
11
12        }
13        return max;
14    }
15}