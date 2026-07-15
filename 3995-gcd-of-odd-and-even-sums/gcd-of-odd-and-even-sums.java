class Solution {
    public int gcdOfOddEvenSums(int n) {
        int EvenSum = 0;
        int OddSum = 0;
        
        for(int i=0; i<n; i++){
            OddSum += (2*i+1);
            EvenSum += (2*i); 
        }
        
        return GCD(OddSum,EvenSum);
    }
    int GCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp; 
        }
        return a;
    }
}