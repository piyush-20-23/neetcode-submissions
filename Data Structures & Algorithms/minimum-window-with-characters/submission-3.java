class Solution {
    public String minWindow(String s, String t) {
        int bestLen = Integer.MAX_VALUE;
        int bestStart = 0;

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();

        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int charDone = 0;
        int required = need.size();

        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            have.put(ch, have.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) && need.get(ch).intValue() == have.get(ch).intValue()) {
                charDone++;
            }

            while (charDone == required) {
                int winLen = r - l + 1;

                if (winLen < bestLen) {

                    //System.out.println(r + " " + l );
                    bestLen = winLen;
                    bestStart = l;
                }

                char leftCh = s.charAt(l);
                have.put(leftCh, have.getOrDefault(leftCh, 0) - 1);

                if (need.containsKey(leftCh) && need.get(leftCh).intValue() > have.get(leftCh).intValue()) {
                    charDone--;
                }
                l++;

            }
            //System.out.println(have);
        }

        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLen);
    }
}
