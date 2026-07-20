package DAY25;

public class Prob1 {

    public static int[] middleNode(int[] arr) {

        int middle = arr.length / 2;

        int[] result = new int[arr.length - middle];

        for (int i = middle; i < arr.length; i++) {
            result[i - middle] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] head = {1, 2, 3, 4, 5};

        int[] result = middleNode(head);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
