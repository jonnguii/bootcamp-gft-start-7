import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe um número inicial: ");
        int numInicial = scanner.nextInt();

        boolean condicaoLoop = true;
        while (condicaoLoop) {
            System.out.println();
            System.out.print("Informe um número para verificação: ");
            int numVerificar = scanner.nextInt();

            if (numVerificar < numInicial) {
                System.out.println();
                System.out.println("-------------------------------------------");
                System.out.println(       "Inválido! Digite um numero maior que " + numInicial);
                System.out.println("-------------------------------------------");
                continue; //ignorava o número do usuário e o resto do programa e retornava ao "loop"
            }

            var resultado = numVerificar % numInicial;
            System.out.println(numVerificar + " % " + numInicial + " = " + resultado);
            condicaoLoop = resultado == 0;
//            if (resultado != 0) break;


        }


    }
}
