class Solution {
    public int minInsertions(String s) {
        int count = 0;
        int ans = 0; 

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(count % 2 == 1){
                    count--;
                    ans++;
                }
                count+=2;
            }else{
                count--;
                if(count < 0){
                    count+=2;
                    ans++;
                }
            }
        }
        return ans+count;
    }
}