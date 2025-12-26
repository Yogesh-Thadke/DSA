class Solution {
    public int bestClosingTime(String customers) {
        
        int n = customers.length();
        if(!customers.contains("N")){
            return n;
        }

        int Y[] = new int[n+1];
        int N[] = new int[n+1];

        int count = 0;
        for(int i=1; i<n+1; i++){
            if(customers.charAt(i-1)=='N'){
                count++;
            }
            N[i]=count;
        }

        count = 0;
        for(int i=n-1; i>=0; i--){
            if(customers.charAt(i)=='Y'){
                count++;
            }
            Y[i]=count;
        }
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0; i<n+1; i++){
            int sum = N[i]+Y[i];
            if(sum<min){
                min = sum;
                ans = i;
            }
        }
        return ans;
    }
}