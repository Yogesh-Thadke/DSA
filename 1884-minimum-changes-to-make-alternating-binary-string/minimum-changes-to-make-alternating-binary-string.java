class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int StartZero = 0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    StartZero++;
                }
            }else{
                if(s.charAt(i)=='0'){
                    StartZero++;
                }
            }
        }
        int StartOne = n-StartZero;

        return Math.min(StartOne, StartZero);
    }
}