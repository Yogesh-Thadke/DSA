class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stc = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'){
                StringBuilder str = new StringBuilder();
                while(stc.peek()!='(' && !stc.isEmpty()){
                    str.append(stc.pop());
                }
                stc.pop();
                for(int j=0; j<str.length(); j++){
                    stc.push(str.charAt(j));
                }
            }else{
                stc.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stc.isEmpty()){
            ans.append(stc.pop());
        }
        return ans.reverse().toString();
    }
}