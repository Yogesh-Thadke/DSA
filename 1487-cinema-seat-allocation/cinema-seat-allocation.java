class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = n*2;
        HashMap<Integer, Set<Integer>>map = new HashMap<>();

        for(int i=0; i<reservedSeats.length; i++){
            int row = reservedSeats[i][0];
            int seat = reservedSeats[i][1];
            
            Set<Integer> seats = map.computeIfAbsent(row, key ->new HashSet<>());
            seats.add(seat);
        } 
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            Set<Integer> seats = entry.getValue();

            boolean A = !seats.contains(2)
            && !seats.contains(3)
            && !seats.contains(4)
            && !seats.contains(5);

            boolean B = !seats.contains(4)
            && !seats.contains(5)
            && !seats.contains(6)
            && !seats.contains(7);

            boolean C = !seats.contains(6)
            && !seats.contains(7)
            && !seats.contains(8)
            && !seats.contains(9);

            if (A && C) {
                ans=ans;
            } else if (A || B || C) {
                ans-=1;
            } else {
                ans-=2;
            }
        }
        return ans;
    }
}