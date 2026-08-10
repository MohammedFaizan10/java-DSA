1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return atMostK(k,nums) - atMostK(k-1,nums);
4    }
5    public int atMostK(int k , int nums[]){
6        int n = nums.length;
7        int low = 0;
8        HashMap<Integer,Integer> map = new HashMap<>();
9        int count = 0;
10        for(int high = 0 ; high < n ; high++){
11            int num = nums[high];
12            map.put(num, map.getOrDefault(num,0)+1);
13            while(map.size() > k){
14                int numL = nums[low];
15                map.put(numL,map.getOrDefault(numL,0)-1);
16                if(map.get(numL) == 0){
17                    map.remove(numL);
18                }
19                
20                low++;
21                
22            }
23            if(map.size() <= k){
24                count += high - low +1;
25            }
26            
27        }
28        return count;
29    }
30}