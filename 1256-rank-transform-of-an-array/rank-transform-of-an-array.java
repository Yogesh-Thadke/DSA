class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] num = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            num[i] = arr[i];
        }
        Arrays.sort(num);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=0; i<num.length; i++){
            if(!map.containsKey(num[i])){
                map.put(num[i],rank);
                rank++;
            }
        }
        for(int i=0; i<num.length; i++){
            num[i] = map.get(arr[i]);
        }
        return num;
    }
}