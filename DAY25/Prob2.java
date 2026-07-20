package DAY25;

public class Prob2 {

    public static boolean isPalindrome(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] head = {1, 2, 2, 1};

        System.out.println(isPalindrome(head));
    }
}
