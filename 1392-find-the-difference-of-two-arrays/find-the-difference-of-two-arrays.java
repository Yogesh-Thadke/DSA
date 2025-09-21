import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Hashtable <Integer,Boolean> t1 = new Hashtable<>();
        Hashtable <Integer,Boolean> t2 = new Hashtable<>();

        for(int num1 : nums1) t1.put(num1, true);
        for(int num1 : nums2) t2.put(num1, true);

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int key: t1.keySet()){
            if(!t2.containsKey(key)) l1.add(key);
        }

        for(int key: t2.keySet()){
            if(!t1.containsKey(key)) l2.add(key);
        }

        return Arrays.asList(l1,l2);
    }
}