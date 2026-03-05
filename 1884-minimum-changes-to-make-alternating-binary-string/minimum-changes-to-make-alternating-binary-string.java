class Solution {
    public int minOperations(String s) {
        StringBuilder str = new StringBuilder();
        int count1=0,count2=0;

        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                str.append('0');
            }else{
                str.append('1');
            }
        }
        String str1 = str.toString();
        str.setLength(0);
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                str.append('1');
            }else{
                str.append('0');
            }
        }
        String str2 = str.toString();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=str1.charAt(i)){
                count1++;
            }
            if(s.charAt(i)!=str2.charAt(i)){
                count2++;
            }
        }

        return Math.min(count1,count2);
    }
}