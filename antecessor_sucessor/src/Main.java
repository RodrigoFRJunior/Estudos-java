import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int inteiro = 0;

        System.out.println("Insira um número inteiro: ");
        inteiro = entrada.nextInt();

        int antecessor = inteiro - 1;
        int sucessor = inteiro + 1;

        System.out.println("O número antecessor é: " + antecessor);

        System.out.println("O número inteiro é: " + inteiro);

        System.out.println("O número sucessor é: " + sucessor);
    }
}