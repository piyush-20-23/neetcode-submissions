class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b, a));
        int[] res = new int[nums.length - k + 1];

        int l = 0; 
        int r = k;

        // first window of k size
        for(int i = 0; i < k; i ++){
            pq.offer(nums[i]);
        }

        while(r <= nums.length){

            //System.out.println(l + " " + r);


            res[l] = pq.peek();

            pq.remove(nums[l]);
            l ++;
            if(r == nums.length){
                break;
            }
            pq.offer(nums[r]);
            r ++;
        }

        return res;
    }
}
