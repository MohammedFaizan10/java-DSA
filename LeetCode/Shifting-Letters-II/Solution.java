1class Solution {
2    public String shiftingLetters(String s, int[][] shifts) {
3        int n = s.length();
4        int diff[] = new int[n+2];
5        int answer[] = new int[n];
6        int sum = 0;
7        for(int i = 0 ; i < shifts.length ; i++){
8            int from = shifts[i][0];
9            int to = shifts[i][1];
10            int direction = shifts[i][2];
11            if(direction == 1){
12                diff[from] += 1;
13                diff[to+1]  -= 1;
14            }
15            else{
16                diff[from] -= 1;
17                diff[to+1] += 1;
18            }
19        }
20        for(int i = 0 ; i < answer.length ; i++){
21            sum += diff[i];
22            answer[i] = sum;
23        }
24
25        StringBuilder sb = new StringBuilder();
26        for(int i = 0 ; i < answer.length ; i++){
27            int curr = s.charAt(i) - 'a';
28            int newposition = (curr + answer[i] % 26 + 26) % 26;
29            char newchar = (char)('a' + newposition);
30            sb.append(newchar);
31        }
32
33        return sb.toString();
34    }
35}