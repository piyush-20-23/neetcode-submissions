class Solution {
    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length - 1;
        int maxHold = 0;

        while(l < r){
            int hold = Math.min(h[l], h[r]) * (r - l);

            maxHold = Math.max(hold, maxHold);
            
            if(h[l] < h[r]){
                l ++;
            }
            else{
                r --;
            }
        }

        return maxHold;
    }
}
