class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            min = Math.min(min, Math.abs(arr[i+1]-arr[i]));
        }
        for(int i=0; i<arr.length-1; i++){
            List<Integer> list = new ArrayList<>();
            int diff = Math.abs(arr[i+1]-arr[i]);
            if(diff == min){
                list.add(arr[i]);
                list.add(arr[i+1]);
            }else{
                continue;
            }
            ans.add(list);
        }
        return ans;
    }
}