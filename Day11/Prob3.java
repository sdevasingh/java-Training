// Prob3 - Bubble Sort
public class Prob3 {
    public static void main(String[] args) {
        int[] a = {5,3,1,4,2};
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4 - i; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
        for (int x : a) System.out.print(x + " ");
    }
}