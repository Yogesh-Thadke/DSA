class Solution {
    public int largestInteger(int num) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        String s = Integer.toString(num);
        for(int i=0; i<s.length(); i++){
            if(((s.charAt(i)-'0')&1)==0){
                even.add((s.charAt(i)-'0'));
            }
            else{
                odd.add((s.charAt(i)-'0'));
            }
        }
        Collections.sort(even,Collections.reverseOrder());
        Collections.sort(odd,Collections.reverseOrder());
        int ans = 0;
        int e = 0;
        int o = 0; 
        for(int i=0; i<s.length(); i++){
            int digit = s.charAt(i)-'0';
            if((digit & 1)==0){
                ans = ans * 10 + even.get(e++);
            }else{
                ans = ans * 10 + odd.get(o++);
            }
        }
        return ans;
    }
}