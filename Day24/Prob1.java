package Day24;

public class Prob1 {

    static int pick = 6;

    public static int guess(int num) {
        if (num == pick) return 0;
        if (num > pick) return -1;
        return 1;
    }

    public static int guessNumber(int n) {
        int l = 1, r = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int g = guess(m);
            if (g == 0) return m;
            if (g < 0) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
