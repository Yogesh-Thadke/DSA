class Solution {
    public String smallestPalindrome(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();

            for(int i=0; i<count/2; i++){
                left.append(c);
            }

            if(count%2==1){
                mid.append(c);
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();
        StringBuilder ans = new StringBuilder();

        ans.append(left);
        ans.append(mid);
        ans.append(right);

        return ans.toString();
    }
}