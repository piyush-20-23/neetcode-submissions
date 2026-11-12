class Solution {
    int[] count = new int[26];

    public int maxCount(){
        int max = 0;

        for(int i = 0; i < 26; i ++){
            if(max < count[i]){
                max = count[i];
            }
        }

        return max;
    }

    public int characterReplacement(String s, int k) {
        int l = 0; 
        int r = 0;

        int maxSubstring = 0;

        while(r < s.length()){
            count[s.charAt(r) - 'A'] ++;

            while((r - l + 1) - maxCount() > k){
                count[s.charAt(l) - 'A'] --;
                l ++;
            }

            maxSubstring = (maxSubstring < (r - l + 1)) ? (r-l + 1) : maxSubstring;
            r ++;
        }

        return maxSubstring;
    }
}
