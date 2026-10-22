class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;

        boolean asc = true, desc = true;
        for(int i=0; i<n; i++){
            int next = nums[(i+1) % n];
            if(next != (nums[i] + 1) % n) asc = false;
            if(next != (nums[i] - 1 + n) % n) desc = false;
        }

        if(!asc && !desc){
            return -1;
        }

        int i0 = 0, p = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0) i0 = i;
            if(nums[i] == n-1) p = i; 
        }

        int ans = Integer.MAX_VALUE;

        if(asc){
            ans = Math.min(ans, Math.min(i0, n - i0 + 2));
        }
        if(desc){
            ans = Math.min(ans, Math.min(p + 1, 1 + (n - 1 - i0)));
        }

        return ans;
    }
}