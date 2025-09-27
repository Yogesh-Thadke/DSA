class Solution {
    public double area(int[] A, int[] B, int[] C){
        return (0.5 * Math.abs((A[0]*(B[1]-C[1]))+(B[0]*(C[1]-A[1]))+(C[0]*(A[1]-B[1]))));
    }
    public double largestTriangleArea(int[][] points) {
        double maxarea = 0.0;
        for(int i=0;i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                for(int k=j+1; k<points.length; k++){
                   double ans = area(points[i], points[j], points[k]);
                   
                   if(ans>maxarea){
                    maxarea = ans;
                   }
                }
            }
        }
        return maxarea;
    }
}