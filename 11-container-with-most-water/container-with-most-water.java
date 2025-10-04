class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int maxVol = -1;
        while(l<r){
            int min = Math.min(height[l],height[r]);
            int volume = min*(r-l);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
            maxVol = Math.max(volume, maxVol);
        }
        return maxVol;
    }
}