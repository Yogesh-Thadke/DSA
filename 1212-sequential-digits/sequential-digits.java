class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();

        String num = "123456789";
        for(int i=2; i<=9; i++){
            for(int j=0; j<=num.length()-i; j++){
                String str = num.substring(j,j+i);
                int number = Integer.parseInt(str);

                if(number>=low && number<=high){
                    list.add(number);
                }
            }
        }
        return list;
    }
}