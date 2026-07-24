package Day29;
import java.util.*;
public class Prob2 {

class Solution {
    public int ladderLength(String b, String e, List<String> w) {
        Set<String> s = new HashSet<>(w);
        if (!s.contains(e)) return 0;
        Queue<String> q = new LinkedList<>();
        q.add(b);
        int l = 1;
        while (!q.isEmpty()) {
            for (int k = q.size(); k > 0; k--) {
                char[] a = q.poll().toCharArray();
                String cur = new String(a);
                if (cur.equals(e)) return l;
                for (int i = 0; i < a.length; i++) {
                    char old = a[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        a[i] = c;
                        String t = new String(a);
                        if (s.remove(t)) q.add(t);
                    }
                    a[i] = old;
                }
            }
            l++;
        }
        return 0;
    }
}
}