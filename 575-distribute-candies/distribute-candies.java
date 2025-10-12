import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : candyType){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int candy = candyType.length/2;
        if(candy <= map.size()){
            return candy;
        }else{
            return map.size();
        }
    }
}