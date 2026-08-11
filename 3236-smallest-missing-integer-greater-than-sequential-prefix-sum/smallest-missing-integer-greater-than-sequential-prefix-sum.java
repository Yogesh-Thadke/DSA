class Solution {
    public int missingInteger(int[] nums) {
        int i = 1;
        int sum = nums[0];
        while(i<nums.length){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
                i++;
            }else{
                //sum+=nums[i-1];
                break;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}