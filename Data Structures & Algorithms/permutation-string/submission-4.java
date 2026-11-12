class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() == 1){
            return s2.contains(s1);
        }

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (char ch : s1.toCharArray()) {
            s1Count[ch - 'a']++;
        }

        int l = 0;
        for (int r = 0; r < s2.length(); r++) {
            s2Count[s2.charAt(r) - 'a']++;

            while (contained(s1Count, s2Count)) {
                if (r - l + 1 == s1.length()) {
                    return true;
                }
                s2Count[s2.charAt(l) - 'a']--;
                l++;
            }
        }

        return false;
    }

    public boolean contained(int[] arr1, int[] arr2) {
        //System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                return false;
            }
        }

        return true;
    }
}