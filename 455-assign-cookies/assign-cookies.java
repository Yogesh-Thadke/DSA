class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count=0, i=0, j=0;
        int n = g.length, m = s.length;

        while(i<n && j<m){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }    
        }
        return count;
    }
}