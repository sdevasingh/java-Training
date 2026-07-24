package Day29;

import java.util.*;

public class Prob6 {

    static class Solution {

        public boolean validPath(int n, int[][] edges, int s, int d) {

            List<List<Integer>> g = new ArrayList<>();

            for (int i = 0; i < n; i++)
                g.add(new ArrayList<Integer>());

            for (int[] e : edges) {
                g.get(e[0]).add(e[1]);
                g.get(e[1]).add(e[0]);
            }

            boolean[] v = new boolean[n];
            Queue<Integer> q = new LinkedList<>();

            q.offer(s);
            v[s] = true;

            while (!q.isEmpty()) {
                int x = q.poll();

                if (x == d)
                    return true;

                for (int y : g.get(x)) {
                    if (!v[y]) {
                        v[y] = true;
                        q.offer(y);
                    }
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {

        int n = 3;
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 0}
        };

        int source = 0;
        int destination = 2;

        Solution s = new Solution();
        System.out.println(s.validPath(n, edges, source, destination));
    }
}
