class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();

        int i=1;
        int j=0;

        while(i<=n && j<target.length){
            list.add("Push");
            if(i==target[j]){
                i++;
                j++;
            }
            else{
                list.add("Pop");
                i++;
            }
        }
        return list;
    }
}