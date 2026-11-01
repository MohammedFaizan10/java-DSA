class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26]; // small letters     //int freq[] = new int[256];
        int n = s.length();
        // count frequency
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        for(int i = 0; i < n ; i++){
            char ch = s.charAt(i);
            if(freq[ch-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}