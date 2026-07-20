package DAY25;

public class Prob6 {

    public static int[] oddEvenList(int[] arr) {

        int[] result = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i += 2) {
            result[index++] = arr[i];
        }

        for (int i = 1; i < arr.length; i += 2) {
            result[index++] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] head = {1, 2, 3, 4, 5};

        int[] result = oddEvenList(head);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
