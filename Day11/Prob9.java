// Prob9 - Palindrome
public class Prob9 {
    public static void main(String[] args) {
        int n = 121, rev = 0, t = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (t == rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}