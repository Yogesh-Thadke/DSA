class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int s = nums[0];
        int l = nums[nums.length-1];
        int j = 0;
        for(int i=s; i<=l; i++){
            if(nums[j]==i){
                j++;
            }else{
                list.add(i);
            }
        }
        return list;
    }
}