class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftsum = 0;
        int full = 0;
        for(int num : nums) {
            full +=num;
        }
        for (int i = 0; i < n; i++) {
            int right = full - leftsum - nums[i];
            if (leftsum == right) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}