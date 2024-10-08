import java.util.Scanner;

public class operacao_Aritimetica {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro númeoro: ");
        int num1 = scanner.nextInt();

        System.out.println("Segundo númeoro: ");
        int num2 = scanner.nextInt();

        System.out.println("Operação Aritmética(+, -, * ou /: ");
        String operacao = scanner.next();

        switch (operacao) {
            case "+":
                System.out.println("A soma dos valores = " + (num1 + num2));
                break;

            case "-":
                System.out.println("A subtração dos valores = " + (num1 - num2));
                break;

            case "*":
                System.out.println("A multplicação dos valores = " + (num1 * num2));
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("A divisão desse valor é inválida");
                }
                else {
                    System.out.println("A divisão dos valores: " + (num1/num2));
                }
                    break;

            default:
                System.out.println("Operação inválida");
                break;
            }
            scanner.close();
        }
    }
