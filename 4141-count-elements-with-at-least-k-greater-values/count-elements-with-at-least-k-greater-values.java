class Solution {
    public int countElements(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i]!=nums[i-1]){
                list.add(nums[i]);
            }
        }
        
        for(int i=0; i<list.size(); i++){
            int indexFirstGreater = upperBound(nums, list.get(i));
            int firstGreater = nums.length-indexFirstGreater;
            map.put(list.get(i), firstGreater);
        }
        int count = 0;
        for(int num : nums){
            if(map.get(num)>=k){
                count++;
            }
        }
        return count;
    }
    public int upperBound(int[] nums, int num){
        int l=0, r=nums.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid] <= num){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}