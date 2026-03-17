class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String SortedStr = new String(str);

            if(!map.containsKey(SortedStr)){
                map.put(SortedStr,new ArrayList());
            }
            map.get(SortedStr).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}