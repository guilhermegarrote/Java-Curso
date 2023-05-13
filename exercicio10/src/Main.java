import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um número:");

        int escolhido = sc.nextInt();
        int end = 1;
        int contador = 0;
        int i = 1;

        while (escolhido != 20) {
            System.out.print("\n" + escolhido + ": ");
            contador = escolhido;
            while (contador != i) {
                end += (end * contador);
                i++;
            }
            System.out.print(end);
            escolhido++;
        }
        sc.close();
    }
}