1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length;
4        int maxEnding = 1;
5        int minEnding = 1;
6        int res = Integer.MIN_VALUE;
7        for(int i = 0 ; i < n ; i++){
8            int v1 = nums[i];
9            int v2 = nums[i] * maxEnding;
10            int v3 = nums[i] * minEnding;
11            maxEnding = Math.max(v1,Math.max(v2,v3));
12            minEnding = Math.min(v1,Math.min(v2,v3));
13            res = Math.max(res , Math.max(maxEnding,minEnding));
14        }
15        return res;
16    }
17}