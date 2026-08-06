1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(nums);
5
6        for(int i = 0 ; i < nums.length -2 ; i++){
7            if( i > 0 && nums[i] == nums[i-1]) continue;
8            int left = i+1;
9            int right = nums.length-1;
10            while(left < right){
11                int sum = nums[i] + nums[left] + nums[right];
12                if(sum == 0){
13                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
14                    while(left < right && nums[left] == nums[left+1]){
15                        left++;
16                    }
17                    while(left < right && nums[right] == nums[right-1] ){
18                        right--;
19                    }
20                    left++;
21                    right--;
22                }
23                else if(sum < 0){
24                    left++;
25                }
26                else{
27                    right--;
28                }
29
30            }
31        }
32        return res;
33}
34}