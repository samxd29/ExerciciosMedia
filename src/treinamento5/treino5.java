package treinamento5;

import java.util.Scanner;

public class treino5 {
    public static void main(String[] args) {

        double salarioMinimo = 0;
        double salarioUsuario = 0;
        double valorSalarioMinimo = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Me informe o valor do salário mínimo: ");
        salarioMinimo = scan.nextDouble();

        System.out.println("Me informe o valor do seu salário: ");
        salarioUsuario = scan.nextDouble();

        valorSalarioMinimo = salarioUsuario / salarioMinimo;
        //quanto
        System.out.println("Seu salário é  " + valorSalarioMinimo + " vezes o valor do salário mínimo.");
    }
}
