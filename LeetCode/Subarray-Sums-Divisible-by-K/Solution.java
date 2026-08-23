1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        int n = nums.length;
4        int res = 0;
5        int sum = 0;
6        HashMap<Integer,Integer> map = new HashMap<>();
7        map.put(0,map.getOrDefault(0,0)+1);
8        for(int i = 0 ; i < n ;i++){
9            sum += nums[i];
10            int div = sum % k;
11            if(div <0){
12                div = div +k;
13            }
14            if(map.containsKey(div)){
15                int freq = map.getOrDefault(div,0);
16                res += freq;
17            }
18
19            map.put(div,map.getOrDefault(div,0)+1);
20
21
22            
23            }
24
25            return res;
26        }
27}