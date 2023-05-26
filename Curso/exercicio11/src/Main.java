import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linha que deseja: ");
        int n1 = sc.nextInt();

            for (int n2 = 1; n1 >= n2; n2++) {
            int n3 = (int) Math.pow(n2, 2);
            int n4 = (int) Math.pow(n2, 3);
            System.out.println(n2 + " " + n3 + " " + n4);
        }

        sc.close();
    }
}