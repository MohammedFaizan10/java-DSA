1class Solution {
2    public int characterReplacement(String s, int k) {
3        int n = s.length();
4        int low = 0;
5        int len = 0;
6        int maxlen = 0;
7        int arr[] = new int[26];
8        int maxfreq = 0;
9        int diff = 0;
10        for(int high = 0 ; high < n ; high++){
11            arr[s.charAt(high) - 'A']++;
12            len = high - low +1;
13            for(int i = 0 ; i < 26 ; i++){
14                maxfreq = Math.max(maxfreq,arr[i]);
15            }
16            diff = len - maxfreq;
17            while(diff > k){
18                arr[s.charAt(low)-'A']--;
19                low++;
20                len = high - low +1;
21                maxfreq = 0;
22                for(int i = 0 ; i < 26 ; i++){
23                    maxfreq = Math.max(maxfreq,arr[i]);
24                }
25                diff = len - maxfreq; 
26            }
27            if(diff <= k){
28                maxlen = Math.max(len,maxlen);
29            }
30
31
32        }
33        return maxlen;
34    }
35}