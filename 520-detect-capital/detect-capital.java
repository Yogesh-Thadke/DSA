class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length(),count=0;
        for(int i=0; i<n; i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        if(count==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        else if(count==n){
            return true;
        }
        else if(count==0){
            return true;
        }
        else{
            return false;
        }
    }
}