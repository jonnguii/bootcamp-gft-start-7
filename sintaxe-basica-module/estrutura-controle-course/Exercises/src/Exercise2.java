import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float peso = 0;
        float altura = 0;


        System.out.printf("Informe seu peso (ex: 60): ");
        peso = scanner.nextFloat();

        System.out.printf("Informe sua altura (ex: 1.70): ");
        altura = scanner.nextFloat();
        scanner.close();
        System.out.println();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC: " + (int) imc);
        System.out.println("Status: ");

        if (imc <= 18.5f) {
            System.out.print("Abaixo do peso");
        } else if (imc >= 18.6f && imc <= 24.9f) {
            System.out.print("Peso ideal");
        } else if (imc >= 25.0f && imc <= 29.9f) {
            System.out.print("Levemente acima do peso");
        } else if (imc >= 30.0f && imc <= 34.9f) {
            System.out.print("Obesidade Grau I");
        } else if (imc >= 35.0f && imc <= 39.9f) {
            System.out.print("Obesidade Grau II (Severa)");
        } else {
            System.out.print("Obesidade III (Mórbida)");
        }


    }
}
