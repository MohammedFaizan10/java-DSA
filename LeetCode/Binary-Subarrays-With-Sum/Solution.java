1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        return atMostK(nums,goal) - atMostK(nums,goal-1);
4    }
5    public int atMostK(int nums[] , int goal){
6        if(goal < 0){
7            return 0;
8        }
9        int n = nums.length;
10        int low = 0;
11        int count = 0;
12        int max = Integer.MIN_VALUE;
13        int sum = 0;
14        for(int high = 0 ; high < n;  high++){
15            sum += nums[high];
16            
17            while(sum > goal){
18                if(low == n){
19                    break;
20                }
21                sum -= nums[low];
22                
23                low++;
24            }
25            if(sum <= goal){
26                count += high - low +1 ;
27            }
28        }
29        return count;
30    }
31}