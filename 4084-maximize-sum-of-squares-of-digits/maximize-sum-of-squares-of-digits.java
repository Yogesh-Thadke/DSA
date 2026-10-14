class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num*9) return "";

        StringBuilder str = new StringBuilder();
        int n = 9;

        while(num>0 && n>0 && sum>0){
            int numCount = Math.min(sum/n, num);

            for(int i=0; i<numCount; i++){
                str.append(n);
            }
            sum -= numCount*n;
            num -= numCount;
            n--;
        }
        while(num > 0){
            str.append('0');
            num--;
        }
        return str.toString();
    }
}