1class Solution {
2    public int pivotIndex(int[] nums) {
3        int n = nums.length;
4        int left = 0;
5        int right = 0;
6        
7        int sum = 0;
8
9
10        for(int i = 0 ; i < n ; i++){
11            sum += nums[i];
12        }
13
14        if(sum == nums[0]){
15            return 0;                // zero th pivot index
16        }
17        
18
19        for(int i = 1 ; i < n ; i++){
20            left += nums[i-1];
21            right = sum - nums[i] - left;
22
23            if(left == right ){
24                return i;
25            }
26        }
27
28        return -1;
29    }
30}