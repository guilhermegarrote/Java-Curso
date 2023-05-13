import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        String quadrante = "";

        while ((x != 0) && (y != 0)) {
            if (x > 0) {
                if (y > 0) {
                    quadrante += "\n 1° Quadrante";
                } else {
                    quadrante += "\n 4° Quadrante";
                }
            } else if (y > 0) {
                quadrante += "\n 2° Quadrante";
            } else {
                quadrante += "\n 3° Quadrante";
            }
            System.out.print("Digite o valor de x: ");
            x = sc.nextInt();
            System.out.print("Digite o valor de y: ");
            y = sc.nextInt();
        }
        System.out.println(quadrante);

        sc.close();

    }
}