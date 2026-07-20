class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    List<List<Integer>> list = new ArrayList<>();
     int vector[] = new int[grid.length*grid[0].length];
        int index = 0;
     for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid[i].length; j++){
            vector[index] = grid[i][j];
            index++;
        }
     }
    k = k % vector.length;
    reverse(vector,0,vector.length-1);
    reverse(vector,0,k-1);
    reverse(vector,k,vector.length-1);
    
    int ind = 0;
    for(int i=0; i<grid.length; i++){
        List<Integer> row = new ArrayList<>();
        for(int j=0; j<grid[i].length; j++){
            row.add(vector[ind]);
            ind++;
        }
        list.add(row);
    }

    return list;
    }
    private void reverse(int[] arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }
    }
}