1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int n = nums.length;
4        int low = 0;
5        int high = k-1;;
6        double sum = 0;
7        double average = 0;
8        double maxavg = Double.NEGATIVE_INFINITY;
9        for(int i = 0 ; i < k ; i++){
10            sum += nums[i];
11        }
12        
13        while(high < n){
14            average = (double)sum/k;
15            maxavg = Math.max(average,maxavg);
16            low++;
17            high++;
18            if( high == n){
19                break;
20            }
21            sum -= nums[low-1];
22            sum += nums[high];
23        }
24        return (double)maxavg;
25    }
26    
27}