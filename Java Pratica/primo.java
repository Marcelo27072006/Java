import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int num = scanner.nextInt();

        boolean numPrimo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                numPrimo = false;
                break;
            }
        }

        if (numPrimo) {
            System.out.println(num + "é primo");
        } else {
            System.out.println(num + "não é primo");
        }
        scanner.close();
    }
}