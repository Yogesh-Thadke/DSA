class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(int i=0; i<columnTitle.length(); i++){
            //char c = columnTitle.charAt(i);
            result = result*26+(columnTitle.charAt(i)-'A'+1);
        }
        return result;
    }
}