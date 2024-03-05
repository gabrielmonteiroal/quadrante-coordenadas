import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;

        do {
            System.out.println("Digite as coordenadas (x e y): ");
            x = sc.nextInt();
            y = sc.nextInt();

            if (x != 0 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                } else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                } else {
                    System.out.println("quarto");
                }
            }

        } while (x != 0 && y != 0);

        System.out.println("Programa encerrado.");

        sc.close();
    }
}