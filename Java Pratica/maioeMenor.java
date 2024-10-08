import java.util.Scanner;

public class maioeMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int numMaior;
        int numMenor;

        System.out.println("Quais os 10 números?");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " º = ");
            num[i] = scanner.nextInt();
        }

        numMenor = num[0];
        numMaior = num[0];

        for (int i = 1; i < 11; i++) {
            if (numMaior <= num[i]) {
                numMaior = num[i];
            }
            if (numMenor >= num[i]) {
                numMenor = num[i];
            }
        }

        System.out.println("Número maior = " + numMaior);
        System.out.println("Número menor = " + numMenor);

        scanner.close();
    }
}
