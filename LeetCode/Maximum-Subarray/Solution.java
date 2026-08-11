1import java.util.*;
2class Solution {
3    public int maxSubArray(int[] nums) {
4        int currentSum = 0;
5        int max_sum = Integer.MIN_VALUE;
6        for(int i = 0 ; i < nums.length; i++){
7            if(currentSum < 0){
8                currentSum = 0;
9            }
10            currentSum +=nums[i];
11            max_sum = Math.max(max_sum , currentSum);
12
13        }
14        return max_sum;
15    }
16}