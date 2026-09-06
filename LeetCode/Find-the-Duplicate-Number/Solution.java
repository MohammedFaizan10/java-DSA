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
12                slow = 0;
13                while(slow != fast){
14                    slow = nums[slow];
15                    fast = nums[fast];
16                }
17                iscycle = false;
18                return slow;
19
20            }
21        }
22
23        return -1;
24        
25    }
26}