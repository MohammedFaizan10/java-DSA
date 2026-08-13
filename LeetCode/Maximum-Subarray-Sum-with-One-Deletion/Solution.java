1class Solution {
2    public int maximumSum(int[] arr) {
3       int nodelete = arr[0];
4        int ans = arr[0];
5        int onedelete = arr[0];
6        for(int i = 1;i<arr.length;i++){
7            onedelete = Math.max(nodelete,onedelete+arr[i]);
8            nodelete = Math.max(nodelete+arr[i],arr[i]);
9
10            ans  = Math.max(ans,Math.max(nodelete,onedelete));
11
12        }
13        return ans;
14
15    }
16}