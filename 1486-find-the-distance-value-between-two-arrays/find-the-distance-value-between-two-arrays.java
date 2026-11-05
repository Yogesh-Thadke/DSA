class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int count = 0;
        for(int num1 : arr1){
            for(int num2 : arr2){
                int diff = Math.abs(num1-num2);
                if(diff <= d){
                    count++;
                    break;
                }
            }
        }
        return arr1.length - count;
    }
}