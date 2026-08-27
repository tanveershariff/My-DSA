class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        // Arrays.sort(height);
        int first = 0 , last = n-1, result = 0, min = 0, wid = 0, maxi = 0;
        while(first!=last) {
            min = Math.min(height[first], height[last]);
            wid = last - first;
            result = min*wid;
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