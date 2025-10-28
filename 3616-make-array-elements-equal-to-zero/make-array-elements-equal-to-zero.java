class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                for(int dir : new int[]{-1,1}){
                    int[] temp = Arrays.copyOf(nums,nums.length);
                    int curr = i;
                    int direction = dir;
                    while(0<=curr && curr<nums.length){
                        if(temp[curr]==0){
                            curr += direction; 
                        }else{
                            temp[curr]-=1;
                            direction = -direction;
                            curr += direction;
                        }
                    }
                    boolean allZero = true;
                    for(int x : temp){
                        if(x!=0){
                            allZero = false;
                            break;
                        }
                    }
                    if(allZero)count++;
                }
            }
        }
        return count;
    }
}