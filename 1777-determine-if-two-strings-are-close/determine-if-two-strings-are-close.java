class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()==word2.length()){
            Map<Character, Integer>map1 = new HashMap<>();
            Map<Character, Integer>map2 = new HashMap<>();

            for(int i=0; i<word1.length(); i++){
                map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
            }
            for(int i=0; i<word2.length(); i++){
                map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
            }
            if(map1.keySet().equals(map2.keySet())){
                List<Integer> list1 = new ArrayList<>();
                List<Integer> list2 = new ArrayList<>();
                for(Integer val : map1.values()){
                    list1.add(val);
                }
                for(Integer val : map2.values()){
                    list2.add(val);
                }
                Collections.sort(list1);
                Collections.sort(list2);
                return list1.equals(list2);
            }else{
                return false;
            }
        }
        return false;
        
    }
}