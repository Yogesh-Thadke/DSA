class Solution {
    public int numSteps(String s) {
        int step = 0;
        int carry = 0;

        for(int i=s.length()-1; i>0; i--){
            int bit = s.charAt(i) - '0';
            bit+=carry;

            if(bit%2==0){
                step+=1;
            }else{
                step+=2;
                carry=1;
            }
        }
        return step+carry;
    }
}