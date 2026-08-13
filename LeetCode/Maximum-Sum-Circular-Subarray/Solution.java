class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
        int N = nums.size(), sum = 0, ans = INT_MIN;
        for(int i=0; i<N; i++){
            nums.push_back(nums[i]);
        }
        int j = 0;
        for(int i=0; i<2*N; i++){
        
            sum += nums[i];
            ans = max(ans, nums[i]);
            if(sum <= 0){
                sum = 0;
                j = i+1;
                continue;
            }

            int len = i-j+1;

            if(len>N){
                sum -= nums[j];
                j++;
            }
            while(j <= i && nums[j] <= 0){
                sum -= nums[j++];
            }

            if(sum) ans = max(ans, sum);
        }
        return ans;
    }
}; 