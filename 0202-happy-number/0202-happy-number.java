class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast != 1){
            slow = digit(slow);
            fast = digit(fast);
            fast = digit(fast);
            if(slow == fast && fast != 1){
                return  false;
            }
            

        }
        return true;
    }

    public int digit(int n){
        int sum = 0;
        while(n > 0){
            int d = n % 10;
            n = n/10;
            sum += d*d;
        }
        return sum;
    }
}