package Ativadade3;
import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dolar: ");
        double cotacaoDolar = scanner.nextDouble();


        System.out.print("Digite o valor do dolar: ");
        double valorDolar= scanner.nextDouble();

        Double valorReal = valorDolar * cotacaoDolar;
        System.out.print("o valor em reais é:"+valorReal);


    }
}
