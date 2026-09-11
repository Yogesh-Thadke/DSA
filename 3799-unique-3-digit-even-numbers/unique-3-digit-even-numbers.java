class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        for(int num : digits){
            freq[num]++;
        }
        int count = 0;
        for(int i=1; i<=9; i++){
            for(int j=0; j<=9; j++){
                for(int k=0; k<=8; k+=2){
                    int[] need = new int[10];
                    need[i]++;
                    need[j]++;
                    need[k]++;

                    boolean possible = true;

                    for(int d=0; d<=9; d++){
                        if(need[d] > freq[d]){
                            possible = false;
                            break;
                        }
                    }
                    if(possible){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}