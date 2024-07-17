package Atividade5;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o nome do funcionario:" );
        String nome = scanner.nextLine();

        System.out.print("digite a horas trabalhadas:" );
        int hrst = scanner.nextLine();

        System.out.print("digite o numero de dependentes:" );
        int depedentes = scanner.nextLine();

        double salarioBruto = (hrst * 3.00) + (depedentes * 100.00);
                double salarioLiquido = salarioBruto * (1 - 0.135 );

        System.out.println("nome do funcionario:" + nome );
        System.out.println("salario liquido:" + salarioLiquido );
    }

}
