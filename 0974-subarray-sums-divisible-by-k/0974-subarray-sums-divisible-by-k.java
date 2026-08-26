class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,map.getOrDefault(0,0)+1);
        for(int i = 0 ; i < n ;i++){
            sum += nums[i];
            int div = sum % k;
            if(div <0){
                div = div +k;
            }
            if(map.containsKey(div)){
                int freq = map.getOrDefault(div,0);
                res += freq;
            }

            map.put(div,map.getOrDefault(div,0)+1);


            
            }

            return res;
        }
}