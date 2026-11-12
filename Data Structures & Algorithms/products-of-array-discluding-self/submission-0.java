class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        boolean zero = false;
        boolean multipleZero = false;

        for(int ele : nums){
            if(ele == 0){
                if(zero){
                    multipleZero = true;
                }
                else{
                    zero = true;
                }
            }else{
                pro *= ele;
            }
        }

        System.out.println(zero + " " + multipleZero + " " + pro);

        for(int i = 0; i < nums.length; i ++){
            if(multipleZero){
                nums[i] = 0;
            }
            else if (zero){
                if(nums[i] == 0){
                    nums[i] = pro;
                }
                else{
                    nums[i] = 0;
                }
            }
            else{
                nums[i] = pro / nums[i];
            }
        }

        return nums;
    }
}  
