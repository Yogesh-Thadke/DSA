class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int ans = k;
        int i = 1;
        while(set.contains(ans)){
            ans = k*i;
            i++;
        }
        return ans;
       
    }
}