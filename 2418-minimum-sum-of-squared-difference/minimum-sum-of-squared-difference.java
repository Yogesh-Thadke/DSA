class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
                long k = (long) k1 + k2;
        int n = nums1.length;

        int[] diff = new int[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            sum += diff[i];
        }

        if (k >= sum) return 0;

        Arrays.sort(diff);

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int value : diff) {
            freqMap.put(value, freqMap.getOrDefault(value, 0) + 1);
        }

        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || diff[i] != diff[i - 1]) {
                temp[index++] = diff[i];
            }
        }

        int[] uniqueDiff = Arrays.copyOf(temp, index);

        while (k > 0 && uniqueDiff.length > 0) {
            int max = uniqueDiff[uniqueDiff.length - 1];

            if (max == 0) break;

            int next = uniqueDiff.length > 1
                    ? uniqueDiff[uniqueDiff.length - 2]
                    : 0;

            long count = freqMap.get(max);
            long cost = count * (max - next);

            if (k >= cost) {
                k -= cost;

                freqMap.remove(max);
                freqMap.put(next,
                    freqMap.getOrDefault(next, 0) + (int) count);

                uniqueDiff = Arrays.copyOf(
                    uniqueDiff, uniqueDiff.length - 1
                );
            } else {
                long reduction = k / count;
                long remainder = k % count;
                int newMax = max - (int) reduction;

                freqMap.remove(max);

                long unchangedCount = count - remainder;
                if (unchangedCount > 0) {
                    freqMap.put(newMax,
                        freqMap.getOrDefault(newMax, 0)
                        + (int) unchangedCount);
                }

                if (remainder > 0) {
                    freqMap.put(newMax - 1,
                        freqMap.getOrDefault(newMax - 1, 0)
                        + (int) remainder);
                }

                k = 0;
            }
        }

        long ans = 0;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            long value = entry.getKey();
            long count = entry.getValue();
            ans += count * value * value;
        }

        return ans;
    }
}