class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        // Arrays.sort(height);
        int first = 0 , last = n-1;
        // int result = 0, min = 0, wid = 0, 
        int maxi = 0;
        while(first!=last) {
            int min = Math.min(height[first], height[last]);
            int wid = last - first;
            int result = min*wid;
            maxi = Math.max(result, maxi);
            if(height[first]> height[last]){
                last--;
            }
            else {
                first++;
            }
        }
        
        return maxi;
        
    }
}