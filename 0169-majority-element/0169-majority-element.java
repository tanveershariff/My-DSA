class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;
        int cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                element = nums[i];
                count = 1;
            } else if (element == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (nums[i] == element) {
                cnt2++;
            }
        }

        // int cnt2 = 0;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == element) {
        //         cnt2++;
        //     }
        // }

        if (cnt2 > (n / 2))
            return element;
        return -1;

    }
}