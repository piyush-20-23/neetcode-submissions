class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        // given array is sorted use two pointers on start and end
        int l = 0;
        int r = n - 1;

        while(l < r){
            int sum = nums[l] + nums[r];
            if(sum == target){
                return new int[]{l + 1, r + 1};
            }

            if(sum > target){
                r --;
            }
            else{
                l ++;
            }
        }
        return new int[]{l, r};
    }
}
