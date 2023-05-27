import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FazerLista fazerlista = new FazerLista();  // Crie uma instância da classe
        Pesquisar pesquisar = new Pesquisar();

        Scanner sc = new Scanner(System.in);

        System.out.println("[1] Ver lista completa\n[2] Pesquisar na lista");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                fazerlista.fazerlista();
                break;
            case 2:
                pesquisar.pesquisar();
                break;
        }

    }

}
