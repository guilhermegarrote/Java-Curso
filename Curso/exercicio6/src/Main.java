import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0;

        System.out.println("Com qual produto você abasteceu? \n  [1]Álcool \n  [2]Gasolina \n  [3]Diesel \n  [4]Nenhum");
        int escolha = sc.nextInt();

        while (escolha != 4) {
            if (escolha == 1) {
                n1++;
            } else if (escolha == 2) {
                n2++;
            } else if (escolha == 3) {
                n3++;
            }
            System.out.println("\nCom qual produto você abasteceu? \n  [1]Álcool \n  [2]Gasolina \n  [3]Diesel \n  [4]Nenhum");
            escolha = sc.nextInt();
        }
        System.out.printf("MUITO OBRIGADO \nAlcool: %d\nGasolina: %d\nDiesel: %d", n1, n2, n3);

        sc.close();
    }
}