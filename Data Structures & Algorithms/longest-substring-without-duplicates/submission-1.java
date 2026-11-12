class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chArr = s.toCharArray();
        Set<Character> hs = new HashSet<>();

        int maxLen = 0;
        
        int l = 0;
        for(int r = 0; r < s.length(); r ++){
            if(!hs.contains(chArr[r])){
                hs.add(chArr[r]);
            }
            else{
                while(hs.contains(chArr[r])){
                    hs.remove(chArr[l]);
                    l ++;
                }
                hs.add(chArr[r]);
            }

            maxLen = Math.max(maxLen, hs.size());
        }

        return maxLen;
    }
}
