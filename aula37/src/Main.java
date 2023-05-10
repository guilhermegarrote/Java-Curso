import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int used, diff;
        double cont, pay;
        cont = 50;

        System.out.println("Quantos minutos você usou?");
        used = sc.nextInt();

        if (used > 100) {
            diff = (used - 100);
            pay = (diff * 2 + cont);
            System.out.printf("Você consumiu %d minutos a mais do que o oferecido pelo plano, totalizando um valor de R$%.2f a ser pago.", diff, pay );
        }
        else {
            System.out.println("Você usou " + used + "% do seu plano, o valor a ser pago é de R$50.00");
        }

        sc.close();
    }

}