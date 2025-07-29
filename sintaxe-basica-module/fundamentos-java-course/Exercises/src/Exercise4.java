import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Insira o nome da primeira pessoa: ");
        var p1 = scn.next();
        System.out.println("Insira a idade da primeira pessoa: ");
        var idade1 = scn.nextInt();

        System.out.println("Boa!");

        System.out.println("Insira o nome da segunda pessoa: ");
        var p2 = scn.next();
        System.out.println("Insira a idade da segunda pessoa: ");
        var idade2 = scn.nextInt();

        var dif = idade1 - idade2;
        System.out.printf("A diferença da idade de %s pra %s, é de %s ano", p1, p2, dif);

    }
}
