1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int n = s2.length();
4        int k = s1.length();
5        if(k > n){
6            return false;
7        }
8        int count = s1.length();
9        HashMap<Character,Integer> map = new HashMap<>();
10        for(int i = 0 ; i < s1.length(); i++){
11            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
12        }
13        int low = 0;
14        int high= 0;
15        int len = 0;
16
17        for(high = 0 ; high < n ; high ++){
18      
19            char chH = s2.charAt(high);
20            if(map.containsKey(chH)){
21                
22                if(map.get(chH) > 0){
23                    count--;
24                }
25                map.put(chH,map.getOrDefault(chH,0)-1);
26            }
27
28
29            while(high - low + 1 > k){
30                char chL = s2.charAt(low);
31                if(map.containsKey(chL)){
32                    map.put(chL,map.getOrDefault(chL,0)+1);
33                    if(map.get(chL) > 0){
34                        count++;
35                    }
36                }
37                low++;
38            }
39
40            if(count == 0 && s1.length() == high - low+1){
41                return true;
42            }
43
44            
45        }
46
47    return false;
48}
49}