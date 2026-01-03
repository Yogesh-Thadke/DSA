class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==0)return list;
        int start = nums[0];

        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i]!=nums[i-1]+1){
                start=nums[i];
            }
            if(i==nums.length-1 || nums[i+1]!=nums[i]+1){
                if(start==nums[i]){
                    list.add(String.valueOf(start));
                }else{
                    list.add(start+"->"+nums[i]);
                }
            }
        }
        return list;
    }
}