class Solution {
    public String minWindow(String s, String t) {

        int n = s.length();
        int count = t.length();
        int low = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++){
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i),0)+1);
        }

        int minlen = Integer.MAX_VALUE;
        String ans = "";
        for(int high = 0 ; high < n ; high++){
            char ch = s.charAt(high);
            if(map.containsKey(ch)){
                if(map.get(ch) > 0){
                    count--;
                }
                map.put(ch,map.getOrDefault(ch,0)-1);
            }

            while(count == 0){
                if(high - low + 1 < minlen){
                    minlen = high - low + 1;
                    ans = s.substring(low , high+1);
                }

                char chL = s.charAt(low);
                if(map.containsKey(chL)){
                    map.put(chL,map.getOrDefault(chL,0)+1);
                    if(map.get(chL) > 0){
                        count++;
                    }
                }
                low++;
            }

            
        }
        return ans;
    
    }
}
            

