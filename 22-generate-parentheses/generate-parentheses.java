class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate("",0,0,n);
        return result;
    }
    void generate(String current, int open, int close, int n){
        
        if(current.length() == 2*n){
            result.add(current);
            return;
        }
        if(open < n){
            generate(current+"(", open+1, close, n);
        }

        if(close < open){
            generate(current+")", open, close+1, n);
        }
    }
}