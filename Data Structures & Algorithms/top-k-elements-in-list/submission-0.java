class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i ++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]
        );

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            pq.add(new int[]{entry.getKey(), entry.getValue()});
        }

        int[] ans = new int[k];

        for(int i = 0; i < k; i ++){
            ans[i] = pq.poll()[0];
        }

        return ans;
    }
}
