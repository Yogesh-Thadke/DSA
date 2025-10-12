import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> map = new HashSet<>();
        for(int num : candyType){
            //map.put(num, map.getOrDefault(num,0)+1);
            map.add(num);
        }
        /*
        int candy = candyType.length/2;
        if(candy <= map.size()){
            return candy;
        }else{
            return map.size();
        }
        */
        return Math.min(candyType.length/2,map.size());
    }
}