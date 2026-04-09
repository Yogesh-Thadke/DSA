class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();

        for(int num : nums){
            store.add(num);
        }
        int maxLength = 0;
        for(int num : store){
            int length = 0;
            if(!store.contains(num-1)){
                int currentNum = num;
                while(store.contains(currentNum)){
                    currentNum++;
                    length++;
                }
                maxLength = Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}