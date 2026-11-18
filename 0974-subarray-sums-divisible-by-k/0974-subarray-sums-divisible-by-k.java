class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int target = sum % k;
            if(target < 0) {
                target+=k;
            }
            if (map.containsKey(target)) {
                count += map.get(target);
                
            } 
            map.put(target, map.getOrDefault(target, 0) + 1);
        }
        return count;
    }
}