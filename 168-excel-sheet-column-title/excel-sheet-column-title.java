class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder result = new StringBuilder();
 
        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber % 26;
            char letter = (char)('A' + rem);
            result.insert(0,letter);
            columnNumber = columnNumber/26;
        }
        return result.toString();
    }
}