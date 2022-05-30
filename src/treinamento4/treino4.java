package treinamento4;

import java.util.Scanner;

public class treino4 {
    public static void main(String[] args) {
        double valor1 = 0;
        double valor2 = 0;
        double quant1 = 0;
        double quant2 = 0;
        double ipi = 0;
        String peca1;
        String peca2;
        double formula = 0;
        double formula1 = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Me informe qual peça você quer saber o valor do IPI: ");
        peca1 = scan.next();

        System.out.println("Me informe qual outra peça você deseja saber o imposto sobre o produto: ");
        peca2 = scan.next();

        System.out.println("Me informe o valor unitário da peça: ");
        valor1 = scan.nextDouble();

        System.out.println("Me informe o segundo valor para a outra peça: ");
        valor2 = scan.nextDouble();

        System.out.println("Me informe a quantidade de pecças do produto 1: ");
        quant1 = scan.nextDouble();

        System.out.println("Me informe a quantidade de peças do produto 2: ");
        quant2 = scan.nextDouble();

        System.out.println("Qual a porcentagem do IPI: ");
        ipi = scan.nextDouble();

        formula = ((valor1 * quant1) * ((ipi/100)+1));

        formula1 = ((valor2 * quant2) * ((ipi / 100) + 1));

        System.out.println("O imposto sobre o produto " + peca1 + " informado é de: " + formula);
        System.out.println("O imposto sobre o produto " + peca2 + " informado é de: " + formula1);






    }
}
