public class Prob1 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int key = 40, l = 0, h = 4;
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] == key) {
                System.out.println("Found");
                return;
            }
            if (a[m] < key) l = m + 1;
            else h = m - 1;
        }
        System.out.println("Not Found");
    }
}