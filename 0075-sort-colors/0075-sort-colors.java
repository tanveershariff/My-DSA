class Solution {
    public void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }
    public void sortColors(int[] nums) {
        int mid =0;
        int low = 0;
        int high = nums.length -1;
        while(mid<=high) {
            if(nums[mid] == 0){
                int t = nums[mid];
                nums[mid] = nums[low];
                nums[low] = t;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int t = nums[mid];
                nums[mid] = nums[high];
                nums[high] = t;
                high--;
            }
        }
    }
}