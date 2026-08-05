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
13            maxfreq = 0;
14            for(int i = 0 ; i < 26 ; i++){
15                maxfreq = Math.max(maxfreq,arr[i]);
16            }
17            diff = len - maxfreq;
18            while(diff > k){
19                arr[s.charAt(low)-'A']--;
20                low++;
21                len = high - low +1;
22                maxfreq = 0;
23                for(int i = 0 ; i < 26 ; i++){
24                    maxfreq = Math.max(maxfreq,arr[i]);
25                }
26                diff = len - maxfreq; 
27            }
28            if(diff <= k){
29                maxlen = Math.max(len,maxlen);
30            }
31
32
33        }
34        return maxlen;
35    }
36}