package Day27;
import java.util.Scanner;
public class Prpb3 {

    static String reverse(String str) {

        if (str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Reversed String = " + reverse(s));

        sc.close();
    }
}
