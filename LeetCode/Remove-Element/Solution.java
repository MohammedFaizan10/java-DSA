1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int count = 0;
4        int i = 0;
5        for(int j = 0 ; j < nums.length ; j++){
6            if(nums[j] != val){
7                nums[i] = nums[j];
8                i++;
9                count++;
10            }
11
12        }
13        return i;
14    }
15}