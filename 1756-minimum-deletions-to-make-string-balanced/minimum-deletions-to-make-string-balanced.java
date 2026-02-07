class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        stack.push(s.charAt(s.length()-1));
        for(int i=s.length()-2; i>=0; i--){
            if(s.charAt(i)=='b' && !stack.isEmpty() && stack.peek()=='a'){        
                stack.pop();
                count++;
            }else{
                stack.push(s.charAt(i));
            }
        }
        return count;
    }
}