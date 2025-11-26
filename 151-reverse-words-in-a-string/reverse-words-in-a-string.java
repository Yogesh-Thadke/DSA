class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = trimSpace(s);
        reverse(sb, 0, sb.length()-1);
        reverseWord(sb);
        return sb.toString();

    }
    private StringBuilder trimSpace(String s){
        int l=0, r=s.length()-1;
        while(l<=r && s.charAt(l)==' ')l++;
        while(r>=l && s.charAt(r)==' ')r--;

        StringBuilder sb = new StringBuilder();

        while(l<=r){
            char c = s.charAt(l);

            if(c!=' '){
                sb.append(c);
            }
            else if(sb.charAt(sb.length()-1)!=' '){
                sb.append(' ');
            }
            l++;
        }
        return sb;
    } 
    private void reverse(StringBuilder st, int l, int r){
        while(l<r){
            char temp = st.charAt(l);
            st.setCharAt(l,st.charAt(r));
            st.setCharAt(r,temp);
            l++;
            r--;
        }
    }
    private void reverseWord(StringBuilder st){
        int start = 0;
        for(int i=0; i<=st.length(); i++){
            if(i==st.length() || st.charAt(i)==' '){
                reverse(st, start, i-1);
                start = i+1;
            }
        }
    }
}