class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq_b = 0;
        int freq_a = 0;
        int freq_l = 0;
        int freq_o = 0;
        int freq_n = 0;

        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='b') freq_b++;
            else if(text.charAt(i)=='a') freq_a++;
            else if(text.charAt(i)=='l') freq_l++;
            else if(text.charAt(i)=='o') freq_o++;
            else if(text.charAt(i)=='n') freq_n++;
        }

        return Math.min(Math.min(freq_b,freq_a),
        Math.min(freq_n,Math.min(freq_o/2,freq_l/2)));
    }
}