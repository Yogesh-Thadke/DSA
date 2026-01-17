class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int arr[] = new int[2];
        int xor = 0,n=nums.length-3;

        for(int num : nums){
            xor^=num;
        }
        for(int i=0; i<=n; i++){
            xor^=i;
        }
        int diff = xor & -xor;
        int x=0, y=0;

        for(int num : nums){
            if((num&diff)==0){
                x ^= num;
            }else{
                y ^= num;
            }
        }

        for(int i=0; i<=n; i++){
            if((i&diff)==0){
                x ^= i;
            }else{
                y ^= i;
            }
        }
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
}