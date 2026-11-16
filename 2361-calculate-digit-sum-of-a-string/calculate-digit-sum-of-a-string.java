class Solution {
    public String digitSum(String s, int k) {
        
        while(s.length() > k){
            String ans = "";
            int l = 0;
            int r = k;

            while(l < s.length()){
                int sum = 0;

                for(int i = l; i < Math.min(r, s.length()); i++){
                    sum += s.charAt(i) - '0';
                }

                ans += sum;
                l = r;
                r += k; 
            }
            s = ans;
        }
        return s;
    }
}