package Day29;
import java.util.*;
public class Prob2 {

    public static void floodFill(int[][] image, int sr, int sc, int originalColor, int newColor) {

        
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }

        
        if (image[sr][sc] != originalColor) {
            return;
        }
        image[sr][sc] = newColor;

        floodFill(image, sr + 1, sc, originalColor, newColor);
        floodFill(image, sr - 1, sc, originalColor, newColor);
        floodFill(image, sr, sc + 1, originalColor, newColor);
        floodFill(image, sr, sc - 1, originalColor, newColor);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] image = new int[rows][cols];

        System.out.println("Enter image values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                image[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter starting row (sr): ");
        int sr = sc.nextInt();

        System.out.print("Enter starting column (sc): ");
        int scCol = sc.nextInt();

        System.out.print("Enter new color: ");
        int newColor = sc.nextInt();

        int originalColor = image[sr][scCol];

        if (originalColor != newColor) {
            floodFill(image, sr, scCol, originalColor, newColor);
        }

        System.out.println("Flood Filled Image:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
