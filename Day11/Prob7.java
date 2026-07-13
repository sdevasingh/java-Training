// Prob7 - Fibonacci
public class Prob7 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}