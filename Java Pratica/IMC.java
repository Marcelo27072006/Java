import java.util.Scanner;

public class IMC {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double IMC = 0;

        System.out.print("Informe seu peso: ");
            double peso = scanner.nextDouble();

        System.out.print("Informe sua altura: ");
            double altura = scanner.nextDouble();

        IMC = peso / (altura * altura);

        System.out.println("Seu IMC: " + IMC);

        if (IMC <= 18.5) {
            System.out.println("Abaixo do peso");
        }
        if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso  normal");
        }
        if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        }
        if (IMC >= 30) {
            System.out.println("Obesidade");
        }
    }
}
