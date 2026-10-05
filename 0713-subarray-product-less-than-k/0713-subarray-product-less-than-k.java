class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;
        int n = nums.length;
        int count = 0;
        int l = 0;
        int m = 1;
        for (int r = 0; r < n; r++) {
            m *= nums[r];
            while (m >= k) {
                m /= nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;

    }
}