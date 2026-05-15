//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int valorCompra = 2000;
        double desconto = valorCompra * 0.1;
        double valorDescontado = 0;

        if (valorCompra >= 100){
            valorDescontado = valorCompra - desconto;

            System.out.println("O valor da compra com desconto foi " + valorDescontado);
        }
        else {
            System.out.println("O valor da compra foi: " + valorCompra);
        }

        }
}
