class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<Integer> positions = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='0'){
                int digit = s.charAt(i) - '0';
                digits.add(digit);
                positions.add(i);
            }
        }
        
        int[] prefixSum = new int[digits.size()+1];
        prefixSum[0]=0;
        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i] = prefixSum[i-1]+digits.get(i-1); 
        }

        long[] pow10 = new long[digits.size()+1];
        pow10[0] = 1;
        int mod = 1000000007;
        for(int i=1; i<pow10.length; i++){
            pow10[i] = (pow10[i-1]*10)%mod;
        }

        long[] prefixNumber = new long[digits.size()+1];
        prefixNumber[0] = 0;
        for(int i=1; i<prefixNumber.length; i++){
            prefixNumber[i] = (prefixNumber[i-1] * 10 + digits.get(i-1))%mod;
        }

        int[] pos = new int[positions.size()];
        for(int i=0; i<pos.length; i++){
            pos[i] = positions.get(i);
        } 

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
    int L = queries[i][0];
    int R = queries[i][1];

    int left = lowerBound(pos, L);
    int right = upperBound(pos, R);

    if (left > right) {
        ans[i] = 0;
        continue;
    }

    int sum = prefixSum[right + 1] - prefixSum[left];

    int len = right - left + 1;

    long number = (prefixNumber[right + 1]
                  - (prefixNumber[left] * pow10[len]) % mod
                  + mod) % mod;

    ans[i] = (int)((number * sum) % mod);
}
return ans;
    }
    private int upperBound(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    int ans = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] <= target) {
            ans = mid;
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return ans;
}
    private int lowerBound(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    int ans = arr.length;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] >= target) {
            ans = mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return ans;
}
}