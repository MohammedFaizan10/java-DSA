1class Solution {
2    public int minSubarray(int[] nums, int p) {
3        int n = nums.length;
4        long currsum = 0;
5        long totalSum = 0;
6        int res = Integer.MAX_VALUE;
7        HashMap<Long,Integer> map = new HashMap<>();
8        map.put((long)0,-1);
9        for(int i = 0 ; i < n ; i++){
10            totalSum += nums[i];
11        }
12        long target = totalSum % p;
13        if(target == 0){
14            return 0;
15        }
16        for(int i = 0 ; i < n ; i++){
17            currsum += nums[i];
18            long currsumrem = currsum % p;
19            long oldrem = (currsumrem - target + p)%p;
20            if(map.containsKey(oldrem)){
21                res = Math.min(res,i- map.get(oldrem));
22            }
23            map.put(currsumrem,i);
24        }
25        return res == nums.length ? -1 : res;
26    }
27}