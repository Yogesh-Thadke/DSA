class Solution {
    public boolean checkString(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                if(count > 0){
                    return false;
                }
            }else{
                count++;
            }
        }
        return true;
    }
}