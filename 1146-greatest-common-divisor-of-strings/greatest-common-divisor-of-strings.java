class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b  = a%b;
            a = temp;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int o = gcd(n,m);
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        else{
            return str1.substring(0,o);
        }
    }
}