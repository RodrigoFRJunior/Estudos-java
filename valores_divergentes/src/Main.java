import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valorA = 0;

        int valorB = 0;

        System.out.println("Insira um valor: ");
        valorA = entrada.nextInt();

        System.out.println("Insira um valor: ");
        valorB = entrada.nextInt();

        if (valorA == valorB){
            int valorFinal = valorA + valorB;
            System.out.println("O valor final é: " + valorFinal);
        }else {
            int valorFinal = valorA * valorB;
            System.out.println("O valor final é: " + valorFinal);
        }
    }
}