import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 2002;

        System.out.print("Digite a senha: ");
        int y = sc.nextInt();

        while (y != x) {
            System.out.println("Senha Inválida");
            System.out.print("\nDigite a senha: ");
            y = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
