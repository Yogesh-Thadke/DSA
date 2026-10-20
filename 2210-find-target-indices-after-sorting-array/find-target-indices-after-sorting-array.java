class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int lessNum = 0;
        int targetCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                targetCount++;
            }
            if(nums[i]<target){
                lessNum++;
            }
        }
        for(int i=lessNum; i<targetCount+lessNum; i++){
            list.add(i);
        }
        return list;
    }
}