import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de casos desejado: ");
        int n = sc.nextInt();

        for (int i = 0; i != n; i++ ){
            System.out.print("\nDigite o 1° valor: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite o 2° valor: ");
            double n2 = sc.nextDouble();
            System.out.print("Digite o 3° valor: ");
            double n3 = sc.nextDouble();

            double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;

            System.out.printf("Media %d: %.1f%n", (i+1), media);

        }

        sc.close();

    }
}