import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int numPares = 0;
        int numImpares = 0;

        System.out.print("Informe um número: ");
        num1 = scanner.nextInt();
        boolean num2Correto = true;

        while (num2Correto) {
            System.out.print("Informe um segundo número maior que o anterior escolhido " + "(" + num1 + "): ");
            num2 = scanner.nextInt();

            if (num2 > num1) {
                num2Correto = false;
            } else {
                System.out.println();
                System.out.println("Opção inválida! ");

            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("         Números informados: " + num1 + " e " + num2);
        System.out.println("--------------------------------------------");

        System.out.println();
        System.out.println("Visualizar o intervalo entre os números informados como: \n" + "1 - Par \n" + "2 - Impar");
        int parOuImpar = scanner.nextInt();


        switch (parOuImpar) {
            case 1:
                System.out.println("--------------------------------------------");
                System.out.println("Números pares do intervalo selecionado:");
                for (int i = num1; i <= num2; i++) {
                    if (i % 2 == 0) {
                        numPares = i;
                        System.out.println(numPares);
                    }
                }
                System.out.println("--------------------------------------------");
                break;

            case 2:
                System.out.println("--------------------------------------------");
                System.out.println("Números impares do intervalo selecionado:");
                for (int j = num1; j <= num2; j++) {
                    if (j % 2 != 0) {
                        numImpares = j;
                        System.out.println(numImpares);
                    }
                }
                System.out.println("--------------------------------------------");
                System.out.println("--------------------------------------------");
                break;

        }
        System.out.println("Intervalo dos números informados em forma decrescente: ");
        for (int k = num2; k >= num1; k--) {
            System.out.println(k);
        }
        System.out.println("--------------------------------------------");
    }
}
