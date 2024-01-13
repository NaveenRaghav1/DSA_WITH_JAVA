import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        System.out.println("this is a program of a factorial of a number-->");
        fact(5);
    }

    public static int fact(int n) {
        // Scanner a=new Scanner(System.in);
        int ans = 1;
        for (int i = 0; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
