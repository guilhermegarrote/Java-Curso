import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long f = 1, i = 1;

        if (n != 0) {
            while (i != n) {
                f += (f * i);
                i++;
            }
        }
        System.out.println(f);
        sc.close();
    }
}