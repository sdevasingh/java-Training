// Prob5 - Insertion Sort
public class Prob5 {
    public static void main(String[] args) {
        int[] a = {5,2,4,1,3};
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        for (int x : a) System.out.print(x + " ");
    }
}