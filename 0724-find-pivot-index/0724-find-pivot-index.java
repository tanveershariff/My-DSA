class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int leftsum = 0;
        int full = Arrays.stream(nums).sum();;
        for(int i=0; i<n; i++) {
            int right = full - leftsum - nums[i];
            if(leftsum == right) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}