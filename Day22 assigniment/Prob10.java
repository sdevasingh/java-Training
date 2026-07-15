public class Prob10{
    public int[] vowelStrings(String[] words, int[][] queries) {
    int n = words.length;
    int[] prefix = new int[n + 1];

    for (int i = 0; i < n; i++) {
        String w = words[i];
        if ("aeiou".indexOf(w.charAt(0)) != -1 &&
            "aeiou".indexOf(w.charAt(w.length() - 1)) != -1)
            prefix[i + 1] = prefix[i] + 1;
        else prefix[i + 1] = prefix[i];
    }

    int[] res = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
        int l = queries[i][0], r = queries[i][1];
        res[i] = prefix[r + 1] - prefix[l];
    }
    return res;
}}