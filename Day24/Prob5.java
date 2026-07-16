package Day24;

public class Prob5 {
    public static int shipWithinDays(int[] w, int d) {
        int l = 0, r = 0;
        for (int x : w) {
            l = Math.max(l, x);
            r += x;
        }
        while (l < r) {
            int m = (l + r) / 2, days = 1, cur = 0;
            for (int x : w) {
                if (cur + x > m) {
                    days++;
                    cur = 0;
                }
                cur += x;
            }
            if (days > d) l = m + 1;
            else r = m;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(weights, 5));
}
}
