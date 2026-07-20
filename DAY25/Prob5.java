package DAY25;

public class Prob5 {

    public static int getIntersection(int[] listA, int[] listB) {

        int i = listA.length - 1;
        int j = listB.length - 1;

        int intersection = -1;

        while (i >= 0 && j >= 0) {

            if (listA[i] == listB[j]) {
                intersection = listA[i];
                i--;
                j--;
            } else {
                break;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {

        int[] listA = {4, 1, 8, 4, 5};
        int[] listB = {5, 6, 1, 8, 4, 5};

        int result = getIntersection(listA, listB);

        if (result == -1) {
            System.out.println("No intersection");
        } else {
            System.out.println("Intersected at '" + result + "'");
        }
    }
}
