class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int i = 0;
        int minEnd = 0;
        int maxEnd = 0;
        int total = 0;
        int globalmax = Integer.MIN_VALUE;
        int globalmin = Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;
        for(i = 0 ; i < n; i++){
            total += nums[i];
            int v1 = nums[i];
            int v2 = maxEnd + nums[i];
            int v3 = minEnd + nums[i];
            maxEnd = Math.max(v1,Math.max(v2,v3));
            minEnd = Math.min(v1,Math.min(v2,v3));
            globalmax = Math.max(globalmax,maxEnd);
            globalmin = Math.min(globalmin,minEnd);
            
        }
        if(globalmax < 0){
            return globalmax;
        }
        int circularSum = total - globalmin;
        return Math.max(globalmax,circularSum);
    }
}