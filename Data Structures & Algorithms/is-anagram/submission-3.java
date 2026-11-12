class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> hm = new HashMap<>();

        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for(char ch : t.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) - 1);
        }

        //System.out.println(hm);

        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }


        return true;
    }
}
