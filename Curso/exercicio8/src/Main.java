import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pares deseja dividir: ");
        int n = sc.nextInt();

        for (int i = 0; i != n; i++){
            float x = sc.nextFloat();
            float y = sc.nextFloat();

            if (y == 0) {
                System.out.println("Divisão impossivel");
            }
            else {
                float z = x / y;
                System.out.println(z);
            }
        }


        sc.close();

    }
}