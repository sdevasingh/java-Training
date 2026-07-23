package Day29;
    
import java.util.*;
public class Prob1 {

    public static int findJudge(int n, int[][] trust) {

        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];

        
        for (int[] t : trust) {
            outDegree[t[0]]++;
            inDegree[t[1]]++;
        }

        
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people (n): ");
        int n = sc.nextInt();

        System.out.print("Enter number of trust pairs: ");
        int m = sc.nextInt();

        int[][] trust = new int[m][2];

        System.out.println("Enter trust pairs (a b):");
        for (int i = 0; i < m; i++) {
            trust[i][0] = sc.nextInt();
            trust[i][1] = sc.nextInt();
        }

        int result = findJudge(n, trust);

        System.out.println("Town Judge: " + result);

        sc.close();
    }
}
