class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxWater = -1;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            maxWater = Math.max(maxWater, h*(r-l));
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return maxWater;
    }
}