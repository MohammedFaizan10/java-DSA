1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n = nums.length;
4        int slow = 0;
5        int fast = 0;
6        boolean iscycle = false;
7        while(iscycle == false){
8            slow = nums[slow];
9            fast = nums[fast];
10            fast = nums[fast];
11            if(slow == fast){
12                iscycle = false;
13                slow = 0;
14                
15                while(slow != fast){
16                    slow = nums[slow];
17                    fast = nums[fast];
18                }
19                
20                return slow;
21
22            }
23        }
24
25        return -1;
26        
27    }
28}