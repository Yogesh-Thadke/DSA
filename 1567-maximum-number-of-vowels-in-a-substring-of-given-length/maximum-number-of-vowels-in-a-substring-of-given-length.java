class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int r=k-1;
        int maxcount=Integer.MIN_VALUE;
        int i=l;
        int count=0;
        while(i<=r){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' 
            ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                count++;
            }
            i++;
        }
        maxcount=Math.max(maxcount,count);
        while(r<s.length()-1){
            if(s.charAt(l)=='a' ||s.charAt(l)=='e' ||s.charAt(l)=='i' 
            ||s.charAt(l)=='o' ||s.charAt(l)=='u'){
                count--;
            }
            l++;
            r++;
            if(s.charAt(r)=='a' ||s.charAt(r)=='e' ||s.charAt(r)=='i' 
            ||s.charAt(r)=='o' ||s.charAt(r)=='u'){
                count++;
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}