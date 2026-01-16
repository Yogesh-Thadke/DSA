class Solution {
    public int maxOperations(String s) {
        int one=0,ans=0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)=='1'){
                one++;
            }
            else{
                if(s.charAt(i+1)=='1'){
                    ans+=one;
                }
            }
        }
        if(s.charAt(s.length()-1)=='0'){
            ans+=one;
        }
        return ans;
    }
}