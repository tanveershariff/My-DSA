class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // int ans = 0;
        // ans = 
        return (helper(nums, k) - helper(nums, k - 1));
    }

    private int helper(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int l = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int r = 0; r < n; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }
            ans += (r - l + 1);
        }
        return ans;
    }
}