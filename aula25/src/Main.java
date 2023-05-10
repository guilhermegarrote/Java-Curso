import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Digite algo: ");

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        String x;
        int y;
        int d;
        int c;
        int b;
        int a;
        double z;
        x = sc.next();
        y = sc.nextInt();
        d = sc.nextInt();
        c = sc.nextInt();
        b = sc.nextInt();
        a = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Você digitou: " + x);
        System.out.println(x);
        System.out.println(y);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        System.out.println(z);

        sc.close();

    }
}