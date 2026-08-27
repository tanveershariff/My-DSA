class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int first = 0 , last = n-1, maxi = 0, result=0;
        while(first!=last) {
            int min = Math.min(height[first], height[last]);
            int wid = last - first;
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