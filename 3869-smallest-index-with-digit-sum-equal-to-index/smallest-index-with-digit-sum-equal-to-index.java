class Solution {
    public int smallestIndex(int[] nums) {
        int minIndex = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int digit = nums[i];
            int remender = 0;
            int sum = 0;
            while(digit!=0){
                remender = digit%10;
                sum+=remender;
                digit /= 10; 
            }
            if(sum == i) return i;
        }
        return -1;
    }
}