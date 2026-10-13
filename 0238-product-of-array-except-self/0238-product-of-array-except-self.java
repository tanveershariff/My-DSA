class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int temp = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[i] = 1;
                continue;
            }
            ans[i] = nums[i - 1] * ans[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {

            if (i == n - 1) {
                right *= nums[i];
                continue;
            }
            ans[i] = ans[i] * right;
            right *= nums[i];
        }

        return ans;
    }
}