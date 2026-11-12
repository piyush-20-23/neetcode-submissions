class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            hm.put(nums[i], i);
        }

        for(int i = 0; i < nums.length - 1; i ++){
            for(int j = i + 1; j < nums.length; j ++){

                int sum = nums[i] + nums[j];

                if(hm.containsKey( - sum)){
                    int k = hm.get( - sum);
                    if(k != i && k != j){
                        List<Integer> triplet = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(triplet);

                        res.add(triplet);
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();


        for(List ls : res){
            ans.add(ls);
        }
        return ans;
    }
}
