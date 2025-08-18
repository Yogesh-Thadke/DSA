class Solution {
    public double average(int[] salary) {
        int n = salary.length, min = salary[0], max = salary[0];
        for(int i=1; i<n; i++){
            if(salary[i]<min){
                min = salary[i];
            }
            if(salary[i]>max){
                max = salary[i];
            }
        }
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += salary[i];
        }
        sum = sum - (min+max);

        double ans = sum/(n-2);
        
        return ans;
    }
}