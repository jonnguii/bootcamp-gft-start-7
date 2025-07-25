import java.time.OffsetDateTime;
import java.time.Year;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var anoBase = OffsetDateTime.now().getYear();

        System.out.printf("Informe seu nome: \n");
        var nome = scn.next();
        System.out.printf("Informe seu ano de nascimento \n");
        var ano = scn.nextInt();

        var idade = anoBase - ano;

        System.out.printf("Olá %s, você tem %s anos", nome, idade);

    }
}