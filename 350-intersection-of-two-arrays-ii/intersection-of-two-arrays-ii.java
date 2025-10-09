import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] bigArr;
        int[] smallArr;
        if(nums1.length>nums2.length){
            bigArr = nums1;
            smallArr = nums2;
        }
        else{
            bigArr = nums2;
            smallArr = nums1;

        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : bigArr){
            map.put(num,(map.getOrDefault(num,0)+1));
        }
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<smallArr.length; i++){
            if(map.containsKey(smallArr[i])){
                result.add(smallArr[i]);
                if(map.get(smallArr[i])>1){
                    map.put(smallArr[i],map.get(smallArr[i])-1);
                }
                else{
                    map.remove(smallArr[i]);
                }
            }
        }
        int[] ans = new int[result.size()]; 
        for(int i=0; i<result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}