public class Prob1 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] a = new int[26], b = new int[26];
        List<Integer> res = new ArrayList<>();
        for (char c : p.toCharArray()) a[c-'a']++;
        for (int i = 0; i < s.length(); i++) {
            b[s.charAt(i)-'a']++;
            if (i >= p.length()) b[s.charAt(i-p.length())-'a']--;
            if (Arrays.equals(a, b)) res.add(i - p.length() + 1);
        }
        return res;
    }
}