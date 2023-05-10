import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x, in = 0, out = 0;

    while ( n != 0 ) {
        x = sc.nextInt();
        n--;

        if (x >= 10 && x <= 20) {
            in++;
        }
        else {
            out++;
        }

    }

    System.out.println(in + " in");
    System.out.println(out + " out");

    sc.close();

    }

}