class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length];
        //prefix[0] = 0;
        prefix[0] = gain[0];
        for(int i=1; i<gain.length; i++){
            prefix[i] = prefix[i-1]+gain[i];
        }
        int max = 0;
        for(int nums : prefix){
            if(nums>max){
                max = nums;
            }
        }
        return max;
    }
}