class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] arr = new int[spells.length];

        for(int i=0; i<spells.length; i++){
            int l=0,r=potions.length-1;
            int ans=potions.length;
            while(l<=r){
                int mid = l+(r-l)/2;
                long target = (long)spells[i]*potions[mid];
                if(target>=success){
                    ans = mid;
                    r = mid-1;
                }else{
                    l=mid+1;
                }
            }
            arr[i] = potions.length-ans;
        }
        return arr;
    }
}