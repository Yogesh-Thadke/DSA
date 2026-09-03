class Solution {
    public boolean uniformArray(int[] nums1) {
        int small = Integer.MAX_VALUE;
        boolean isnumeven = true;

        for(int num : nums1){
            small = Math.min(small,num);
        }
        boolean iseven = false;
        if(small % 2 == 0){
            iseven = true;
        }

        for(int i=0; i<nums1.length; i++){
            if(nums1[i] % 2 == 1){
                isnumeven = false;
                break;
            }
        }
        if(iseven == true){
            if(isnumeven == true){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}