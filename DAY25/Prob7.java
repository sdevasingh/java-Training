package DAY25;

public class Prob7 {
    public static int[] removeNthFromEnd(int[] arr, int n) {

        int removeIndex = arr.length - n;

        int[] result = new int[arr.length - 1];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i != removeIndex) {
                result[index++] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] head = {1, 2, 3, 4, 5};
        int n = 2;

        int[] result = removeNthFromEnd(head, n);

        for (int i : result) {
            System.out.print(i + " ");
        }
    } 
}
