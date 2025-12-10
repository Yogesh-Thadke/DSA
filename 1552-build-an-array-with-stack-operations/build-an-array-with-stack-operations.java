class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : target){
            set.add(num);
        }
        for(int i=1; i<=target[target.length-1]; i++){
            list.add("Push");
            if(!set.contains(i)){
                list.add("Pop");
            }
        }
        return list;
    }
}