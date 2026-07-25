class Solution {
    public int maxProduct(int n) {
        String str = Integer.toString(n);
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)-'0')>max1){
                max2 = max1;
                max1 = (str.charAt(i)-'0');
            }else if((str.charAt(i)-'0')>max2){
                max2 = (str.charAt(i)-'0');
            }
        }
        return max1*max2;
    }
}