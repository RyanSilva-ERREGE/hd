package Atividade1;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("digite o primeiro numero:");
       Float num1 = scanner.nextFloat();

       System.out.print("digite o segundo numero:");
       Float num2 = scanner.nextFloat();

               Float mult = num1 * num2;
       System.out.print("a soma dos numeros é:"+mult);
    }

}
