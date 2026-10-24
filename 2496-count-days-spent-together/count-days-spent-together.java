class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int[] arr = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int AAm = Integer.parseInt(arriveAlice.substring(0,2));
        int AAd = Integer.parseInt(arriveAlice.substring(arriveAlice.length()-2));

        int ALm = Integer.parseInt(leaveAlice.substring(0,2));
        int ALd = Integer.parseInt(leaveAlice.substring(leaveAlice.length()-2));

        int BAm = Integer.parseInt(arriveBob.substring(0,2));
        int BAd = Integer.parseInt(arriveBob.substring(arriveBob.length()-2));

        int BLm = Integer.parseInt(leaveBob.substring(0,2));
        int BLd = Integer.parseInt(leaveBob.substring(leaveBob.length()-2));

        int alisArival = arr[AAm-1]+AAd;
        int alisLeave = arr[ALm-1]+ALd;

        int bobArival = arr[BAm-1]+BAd;
        int bobLeave = arr[BLm-1]+BLd;

        int a = Math.max(alisArival,bobArival);
        int b = Math.min(alisLeave, bobLeave);

        return ((b - a + 1) > 0) ? (b - a + 1) : 0;
    }
}