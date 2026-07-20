package DAY25;

public class Prob4 {

    public static void deleteNode(int[] arr, int node) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == node) {
                arr[i] = arr[i + 1];

                for (int j = i + 1; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] head = {4, 5, 1, 9};
        int node = 5;

        deleteNode(head, node);

        for (int i = 0; i < head.length - 1; i++) {
            System.out.print(head[i] + " ");
        }
    }
}
