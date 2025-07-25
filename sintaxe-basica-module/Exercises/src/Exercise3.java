import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Informe a medida da base do retangulo: ");
        var base = scn.nextDouble();
        System.out.println("Informe a medida da altura do retangulo: ");
        var altura = scn.nextDouble();

        var area = base * altura;
        System.out.println();
        System.out.printf("A area do retangulo é: %s", area);

    }
}
