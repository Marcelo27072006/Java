import java.util.Scanner;

public class numEspecifico {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] num = new int[10];
            int numEspecifico;
            int contador = 0;

            System.out.print("Número especifico = ");
            numEspecifico = scanner.nextInt();

            for (int i = 0; i < 10; i++) {
                num[i] = scanner.nextInt();
                if (num[i] == numEspecifico) {
                    contador = contador+1;
                    i++;
                }
            }
            System.out.println(numEspecifico + " apareceu: " + contador + " vezes");
            scanner.close();
        }
    }