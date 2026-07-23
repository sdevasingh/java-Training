package DAY25;

public class Prob8 {

    public static int pairSum(int[] arr) {

        int max = 0;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum > max) {
                max = sum;
            }

            left++;
            right--;
        }

        return max;
    }

    public static void main(String[] args) {

        int[] head = {5, 4, 2, 1};

        System.out.println(pairSum(head));
    }
}
