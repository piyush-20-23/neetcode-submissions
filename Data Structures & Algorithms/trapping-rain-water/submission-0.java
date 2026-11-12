class Solution {
    public int trap(int[] h) {
        int len = h.length;

        // building prefix and suffix
        int[] pre = new int[len];
        int[] suf = new int[len];

        for(int i = 1; i < len; i ++){
            pre[i] = Math.max(pre[i-1], h[i-1]);
        }

        for(int i = len - 2; i >= 0; i --){
            suf[i] = Math.max(suf[i + 1], h[i+1]);
        }

        int hold = 0;

        for(int i = 0; i < len; i ++){
            int currHold = Math.min(pre[i], suf[i]) - h[i];
            if(currHold > 0){
                hold += currHold;
            }
        }

        return hold;
    }
}
