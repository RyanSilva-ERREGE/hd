package Atividade6;
import  java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor de a:");
        int A = scanner.nextInt();

        System.out.println("digite o valor de b:");
        int B = scanner.nextInt();

        System.out.println("digite o valor de c:");
        int C = scanner.nextInt();

        int R = (A+B) * (A+B);
        int S = (B*C) * (B*C);

        double D = (R + S) / 2.0;
        System.out.println("o valor de D é:" +D);
    }
}
