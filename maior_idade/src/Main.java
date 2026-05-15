import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome = "";
        int idade;

        System.out.println("Insira seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Insira sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 18){

            System.out.println(nome +" você é maior de idade");

        }else{

            System.out.println(nome + " você é menor de idade");

        }
    }
}