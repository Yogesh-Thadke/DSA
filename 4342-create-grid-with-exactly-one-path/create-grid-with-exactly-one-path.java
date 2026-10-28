class Solution {
    public String[] createGrid(int m, int n) {
        String[] str = new String[m];
        String ans = "";
        for(int i=0; i<n; i++){
            ans+='.';
        }
        str[0] = ans;

        for(int i=1; i<m; i++){
            String ans2 = "";
            for(int j=0; j<n; j++){
                if(j == n-1){
                    ans2+='.';
                }else{
                    ans2+='#';
                }
            }
            str[i] = ans2;
        }
        return str;
    }
}