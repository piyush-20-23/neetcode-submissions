class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        for(int ele : nums){
            if(hs.contains(ele)){
                return true;
            }

            hs.add(ele);
        }

        return false;
    }
}