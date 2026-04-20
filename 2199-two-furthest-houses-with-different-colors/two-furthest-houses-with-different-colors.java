class Solution {
    public int maxDistance(int[] colors) {
        int diff=0;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<colors.length; i++){
            for(int j=i; j<colors.length; j++){
                if(colors[i]!=colors[j]){
                    diff = Math.abs(i-j);
                }
                ans = Math.max(ans,diff);
            }
        }
        return ans;
    }
}