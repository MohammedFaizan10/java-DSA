1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        int low = 0;
4
5        int n = nums.length;
6        long sum = 0;
7        long maxsum = 0;
8        int len = 0;
9        HashMap<Integer,Integer> map = new HashMap<>();
10
11        for(int high = 0 ; high < n  ; high++){
12            int num = nums[high];
13            map.put(num,map.getOrDefault(num,0)+1);
14            sum += nums[high];
15            len = high - low+1;
16        
17            while(len > k){
18                int numL = nums[low];
19                map.put(numL,map.getOrDefault(numL,0)-1);
20                if(map.get(numL) == 0){
21                    map.remove(numL);
22                }
23                low++;
24                sum -= nums[low-1];
25                len = high - low+1;
26                
27
28            }
29            if(len == k && map.size() == k){
30                maxsum = Math.max(sum,maxsum);
31            }
32        }
33        return maxsum;
34    }
35    
36}