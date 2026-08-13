class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int noDelete = 0;                          // BESTENDING
        int oneDelete = Integer.MIN_VALUE;         // BESTENDING WITH ONE DELETION
        int res = Integer.MIN_VALUE;

        for(int i = 0 ; i < n; i++){
            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            noDelete = Math.max(arr[i], prevNoDelete + arr[i]);
            if(i == 0){
                oneDelete = Integer.MIN_VALUE;
            }
            else{
                int v1 = Integer.MIN_VALUE;
                if(prevOneDelete != Integer.MIN_VALUE){
                    v1 = prevOneDelete + arr[i];
                }
                oneDelete = Math.max( v1, prevNoDelete);
            }
            
            res = Math.max(res,Math.max(oneDelete,noDelete));
        }

        return res;

    }
}