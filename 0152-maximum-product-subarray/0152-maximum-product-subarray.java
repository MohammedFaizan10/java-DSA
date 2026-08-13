class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxEnding = 1;
        int minEnding = 1;
        int res = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            int v1 = nums[i];
            int v2 = nums[i] * maxEnding;
            int v3 = nums[i] * minEnding;
            maxEnding = Math.max(v1,Math.max(v2,v3));
            minEnding = Math.min(v1,Math.min(v2,v3));
            res = Math.max(res , Math.max(maxEnding,minEnding));
        }
        return res;
    }
}