import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.printf("Informe a medida dos lados: ");
        var lado = scn.nextDouble();

        var area = lado * lado;
        System.out.printf("A area do quadrado é: %s", area);
    }
}
