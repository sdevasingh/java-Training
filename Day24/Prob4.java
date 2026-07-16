package Day24;

public class Prob4 {

    public static int findMin(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] > a[r]) l = m + 1;
            else r = m;
        }
        return a[l];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(findMin(arr));
    }
} 

