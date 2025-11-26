class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        if(s.length()==0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        String[] st = s.split(" +");
        int n = st.length;
        for(int i = n-1; i>=0; i--){
            sb.append(st[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}