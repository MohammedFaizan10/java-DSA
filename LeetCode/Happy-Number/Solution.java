1class Solution {
2    public boolean isHappy(int n) {
3        int slow = n;
4        int fast = n;
5        while(fast != 1){
6            slow = digit(slow);
7            fast = digit(fast);
8            fast = digit(fast);
9            if(slow == fast && fast != 1){
10                return  false;
11            }
12            
13
14        }
15        return true;
16    }
17
18    public int digit(int n){
19        int sum = 0;
20        while(n > 0){
21            int d = n % 10;
22            n = n/10;
23            sum += d*d;
24        }
25        return sum;
26    }
27}