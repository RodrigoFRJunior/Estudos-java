//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;

        System.out.println("Insira sua nota: ");
        nota1 = entrada.nextInt();

        System.out.println("Insira sua nota: ");
        nota2 = entrada.nextInt();

        System.out.println("Insira sua nota: ");
        nota3 = entrada.nextInt();

        double mediaNotas = (nota1 + nota2 + nota3) / 3.0;

        String mediaFormatada = String.format("%.2f", mediaNotas);
        System.out.println("Sua média de notas é " + mediaFormatada);

        if (mediaNotas >=7){
            System.out.println("Você foi aprovado!");
        } else if (mediaNotas < 5) {
            System.out.println("Você foi reprovado!");
        } else {
            System.out.println("Você está de recuperação!");
        }

    }
}