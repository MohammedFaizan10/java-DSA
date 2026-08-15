class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxEnd = 0;
        int minEnd = 0;
        int res = Integer.MIN_VALUE;;
        for(int i = 0 ; i < n ; i++){
            int v1 = nums[i];
            int v2 = (nums[i] + maxEnd);
            int v3 = nums[i] + minEnd;
            maxEnd = Math.max(v1,Math.max(v2,v3));
            minEnd = Math.min(v1,Math.min(v2,v3));
            res = Math.max(res,Math.max(Math.abs(maxEnd),Math.abs(minEnd)));
        }
        return res;
    }
}