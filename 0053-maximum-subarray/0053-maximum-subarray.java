class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int bestEnding = 0;
        int max = Integer.MIN_VALUE;;
        for(int i = 0 ; i < n ; i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];
            bestEnding = Math.max(v1,v2);
            max = Math.max(max,bestEnding);

        }
        return max;
    }
}