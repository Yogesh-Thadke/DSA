class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num*9) return "";

        StringBuilder str = new StringBuilder();

        int r = sum%9;
        int nineCount = sum/9;
        for(int i=0; i<nineCount; i++){
            str.append('9');
        }
        if(r>0){
            str.append((char) ('0'+ r));
        }
        int zeros = num-str.length();
        for(int i=0; i<zeros; i++){
            str.append('0');
        }

        return str.toString();
    }
}