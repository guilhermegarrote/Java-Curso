import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n1 = sc.nextInt();

        for (int n2 = 1; n1 >= n2; n2++){
            if (n1 % n2 == 0) {
                System.out.println(n2);
            }
        }

        sc.close();
    }
}