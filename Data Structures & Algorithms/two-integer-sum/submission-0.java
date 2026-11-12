class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            hm.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i ++){
            if(hm.containsKey(target - nums[i])){
                int j = hm.get(target - nums[i]);
                if(j != i){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{0,0};
    }
}
