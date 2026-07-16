package Day24;

public class Prob3 {
        public static int findPeakElement(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] > a[m + 1]) r = m;
            else l = m + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(findPeakElement(arr));
}
}
