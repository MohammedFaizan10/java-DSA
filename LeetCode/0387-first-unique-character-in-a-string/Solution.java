class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[256];
        int n = s.length();
        // count frequency
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }

        for(int i = 0; i < n ; i++){
            char ch = s.charAt(i);
            if(freq[ch] == 1){
                return i;
            }
        }
        return -1;
    }
}