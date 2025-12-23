class Solution {
    public String removeStars(String s) {
        StringBuilder st = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='*'){
                st.append(s.charAt(i));
            }else{
                st.deleteCharAt(st.length()-1);
            }
        }
        return st.toString();
    }
}