class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int ans = n;
        int sum = 0;
        for (int r = 0; r < n; r++) {
            sum = sum + nums[r];
            while (sum >= target) {
                ans = Math.min(ans, r - l + 1);
                sum = sum - nums[l];
                l++;
            }
            if (r - l + 1 == n) {
                return 0;
            }
        }

        return ans;
    }
}