class Solution {
    public int[] sortByReflection(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .sorted((a, b) -> {
                    int ra = reflect(a);
                    int rb = reflect(b);
                    if (ra != rb) return ra - rb;
                    return a - b;
                })
                .mapToInt(i -> i)
                .toArray();
    }
    private int reflect(int x){
        String binary = Integer.toBinaryString(x);
        String rev = new StringBuilder(binary).reverse().toString();
        return Integer.parseInt(rev,2);
    }
}