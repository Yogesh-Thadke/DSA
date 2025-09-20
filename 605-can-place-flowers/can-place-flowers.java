class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0, num=flowerbed.length;
        for(int i=0;i<num;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i == num-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                count++;
            }
        }
        if(count==n || count>n){
            return true;
        }
        else{
            return false;
        }
    }
}