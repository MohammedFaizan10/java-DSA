1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        ArrayList<Integer> list = new ArrayList<>();
4        int n = s.length();
5        int k = p.length();
6        if(k > n){
7           return list;
8        }
9        int low = 0;
10        int count = k;
11        HashMap<Character,Integer> map = new HashMap<>();
12        for(int i = 0 ; i < k ; i++){
13            map.put(p.charAt(i) , map.getOrDefault(p.charAt(i), 0)+1);
14        }
15
16        for(int high = 0 ; high < n ; high++){
17            char ch = s.charAt(high);
18            if(map.containsKey(ch)){
19                if(map.get(ch) > 0){
20                    count--;
21                }
22                map.put(ch,map.getOrDefault(ch,0)-1);
23            }
24
25            while(high - low + 1 > k){
26                char chL = s.charAt(low);
27                if(map.containsKey(chL)){
28                    map.put(chL,map.getOrDefault(chL, 0)+1);
29                    if(map.get(chL) > 0){
30                        count++;
31                    }
32                }
33
34                low++;
35            }
36
37            if(count == 0 && high - low + 1 == k){
38                list.add(low);
39            }
40        }
41
42        return list;
43
44
45    }
46}