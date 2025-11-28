class Solution {
    public int compress(char[] chars) {
        int i=0;
        int w=0;

        while(i<chars.length){
            char curr = chars[i];
            int count = 0;

            while(i<chars.length && chars[i]==curr){
                i++;
                count++;
            }
            chars[w++]=curr;

            if(count>1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[w++]=c;
                }
            }
        }
        return w;
    }
}