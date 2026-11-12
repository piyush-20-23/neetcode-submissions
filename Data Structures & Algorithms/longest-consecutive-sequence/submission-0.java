class Solution {
    public int longestConsecutive(int[] nums) {
        
        // use hashset to store every element
        Set<Integer> hs = new HashSet<>();

        for (int ele : nums) {
            hs.add(ele);
        }

        // identify the start of a sequesnce
        Set<Integer> start = new HashSet<>();
        for (int i : hs) {
            if (!hs.contains(i - 1)) {
                start.add(i);
            }
        }

        // find the longest sequence from every start point
        int longCon = 0;
        for (int i : start) {
            int ele = i;
            int con = 1;
            while (hs.contains(ele + 1)) {
                con++;
                ele++;
            }

            longCon = Math.max(con, longCon);
        }

        return longCon;
    }
}
