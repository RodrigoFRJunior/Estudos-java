//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double peso = 0;
        double altura = 0;

        System.out.println("Insira seu peso: ");
        peso = entrada.nextInt();

        System.out.println("Insira sua altura em cm: ");
        altura = entrada.nextInt();

        double alturaMetros = altura / 100.0;

        double imc = peso / (alturaMetros * alturaMetros);

        if (imc < 18.5){
            System.out.printf("Você está abaixo do peso seu imc é: %.2f%n",imc);
        } else if (imc > 24.9){
            System.out.printf("Você está acima do peso seu imc é: %.2f%n",imc);
        } else {
            System.out.printf("Você está no peso ideal seu imc é: %.2f%n",imc);
        }
    }
}