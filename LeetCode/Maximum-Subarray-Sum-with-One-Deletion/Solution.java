1class Solution {
2    public int maximumSum(int[] arr) {
3        int n = arr.length;
4        int noDelete = 0;                          // BESTENDING
5        int oneDelete = Integer.MIN_VALUE;         // BESTENDING WITH ONE DELETION
6        int res = Integer.MIN_VALUE;
7
8        for(int i = 0 ; i < n; i++){
9            int prevNoDelete = noDelete;
10            int prevOneDelete = oneDelete;
11
12            noDelete = Math.max(arr[i], prevNoDelete + arr[i]);
13            if(i == 0){
14                oneDelete = Integer.MIN_VALUE;
15            }
16            else{
17                int v1 = Integer.MIN_VALUE;
18                if(prevOneDelete != Integer.MIN_VALUE){
19                    v1 = prevOneDelete + arr[i];
20                }
21                oneDelete = Math.max( v1, prevNoDelete);
22            }
23            
24            res = Math.max(res,Math.max(oneDelete,noDelete));
25        }
26
27        return res;
28
29    }
30}