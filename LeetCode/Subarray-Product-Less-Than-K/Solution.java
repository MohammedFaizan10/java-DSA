1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int n = nums.length;
4        if(k <= 1){
5            return 0;
6        }
7        int count = 0;
8        int low = 0;
9        int prod = 1;
10        for(int high = 0 ; high < n ; high++){
11            prod *= nums[high];
12            while(prod >= k){
13                prod /= nums[low];
14                low++;
15            }
16            count += high - low +1;
17        }
18        return count;
19    }
20}