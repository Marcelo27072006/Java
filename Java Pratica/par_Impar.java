import java.util.Scanner;

public class par_Impar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o numero que será analisado?");
        int numero = scanner.nextInt();
        int analise = numero%2;

        if (analise == 0) {
            System.out.println("Esse número é par");
        }
        else {
            System.out.println("Esse número é impar");
        }
        scanner.close();
    }
}
