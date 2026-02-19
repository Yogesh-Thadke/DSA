class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        int count = 0;
        while(i<s.length() && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                count++;
                j++;
            }else{
                i=j;
                list.add(count);
                count=0;
            }
        }
        list.add(count);
        int sum = 0;
        for(int k=0; k<list.size()-1; k++){
            sum+=Math.min(list.get(k),list.get(k+1));
        }
        return sum;
    }
}