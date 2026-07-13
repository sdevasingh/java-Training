// Prob8 - Prime Number
public class Prob8 {
    public static void main(String[] args) {
        int n = 13, f = 0;
        for (int i = 2; i < n; i++)
            if (n % i == 0) f = 1;
        if (f == 0) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}