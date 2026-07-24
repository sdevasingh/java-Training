package Day30;

import java.util.*;

public class Prob3 {
    static boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0;
        for (int b : bills) {
            if (b == 5) f++;
            else if (b == 10 && f-- > 0) t++;
            else if (b == 20 && ((t > 0 && f-- > 0 && t-- > 0) || (f -= 3) >= 0)) {}
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bills = new int[n];
        
        for (int i = 0; i < n; i++) 
            bills[i] = sc.nextInt();

        System.out.println(lemonadeChange(bills));
    }
}