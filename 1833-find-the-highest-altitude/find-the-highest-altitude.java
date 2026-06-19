class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = Integer.MIN_VALUE;
        int height = 0;
        for(int i=0; i<gain.length; i++){
            height += gain[i];
            altitude = Math.max(altitude,height);
        }
        if(altitude<0){
            return 0;
        }else{
            return altitude;
        }
    }
}