class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        long maxsum = 0;
        long sum = 0;

        int left = 0;

        for(int right = 0; right<n; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum+=nums[right];

            if(right-left+1==k) {
                maxsum = Math.max(maxsum, sum);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return maxsum;
    }
}