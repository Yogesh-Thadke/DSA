class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                l1.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>pivot){
                l2.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==pivot){
                p.add(nums[i]);
            }
        }
        int index = 0;
        for(int num : l1){
            ans[index++] = num;
        }
        for(int num : p){
            ans[index++] = num;
        }
        for(int num : l2){
            ans[index++] = num;
        }

        return ans;
    }
}