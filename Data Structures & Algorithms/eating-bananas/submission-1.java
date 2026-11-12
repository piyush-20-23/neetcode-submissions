
class Solution {

    public int minEatingSpeed(int[] piles, int high) {

        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int l = 1;
        int h = max;

        while (l <= h) {

            int mid = l + (h - l) / 2;

            if (timeReq(piles, mid) > high) {
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }

        return l;
    }

    public long timeReq(int[] piles, int k) {

        long timeTaken = 0;

        for (int i = 0; i < piles.length; i++) {
            timeTaken += (piles[i] + k - 1) / k;
        }

        return timeTaken;
    }
}
