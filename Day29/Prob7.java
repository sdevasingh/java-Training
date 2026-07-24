package Day29;

public class Prob7 {
    class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }
    void dfs(int[][] a, int r, int c, int old, int col) {
        if (r < 0 || c < 0 || r >= a.length || c >= a[0].length || a[r][c] != old) return;
        a[r][c] = col;
        dfs(a, r + 1, c, old, col);
        dfs(a, r - 1, c, old, col);
        dfs(a, r, c + 1, old, col);
        dfs(a, r, c - 1, old, col);
    }
}
}