public class Prob1 {
    public char findTheDifference(String s, String t) {
    int res = 0;
    for (char c : s.toCharArray()) res ^= c;
    for (char c : t.toCharArray()) res ^= c;
    return (char) res;
}
}
