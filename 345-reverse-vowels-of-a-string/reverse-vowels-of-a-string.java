class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length()-1;
       
       while(i<j){
            if(chars[i]!='a'&&chars[i]!='A'&& chars[i]!='e'&& chars[i]!='E'&&
                chars[i]!='i'&&chars[i]!='I'&&chars[i]!='o'&&chars[i]!='O'&&
                chars[i]!='u'&&chars[i]!='U'){
                    i++;
                    continue;
            }
            if(chars[j]!='a'&&chars[j]!='A'&&chars[j]!='e'&&chars[j]!='E'&&
                chars[j]!='i'&&chars[j]!='I'&&chars[j]!='o'&&chars[j]!='O'&&
                chars[j]!='u'&&chars[j]!='U'){
                    j--;
                    continue;
            }

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
       }
       return new String(chars);
    }
}