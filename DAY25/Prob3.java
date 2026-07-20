package DAY25;

public class Prob3 {

    public static int[] removeElements(int[] arr, int val) {

        int count = 0;

        for (int i : arr) {
            if (i != val) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;

        for (int i : arr) {
            if (i != val) {
                result[index++] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] head = {1, 2, 6, 3, 4, 5, 6};
        int val = 6;

        int[] result = removeElements(head, val);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}