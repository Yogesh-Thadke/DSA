class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int aSum = 0;
        for(int num : apple){
            aSum += num;
        }
        int cap=0;
        int ans=0;
        Arrays.sort(capacity);
        for(int i=capacity.length-1; i>=0; i--){
            cap+=capacity[i];
            ans++;
            if(cap>=aSum){
                return ans;
            }
        }
        return ans;
    }
}