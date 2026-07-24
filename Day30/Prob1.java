package Day30;

    import java.util.*;

public class Prob1{
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        for (int j = 0; j < s.length && i < g.length; j++) {
            if (s[j] >= g[i]) i++;
        }
        return i;
    }
}
