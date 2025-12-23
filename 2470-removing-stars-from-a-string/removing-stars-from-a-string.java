class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        StringBuilder st = new StringBuilder();
        while(!stack.isEmpty()){
            st.append(stack.pop());
        }
        return st.reverse().toString();
    }
}