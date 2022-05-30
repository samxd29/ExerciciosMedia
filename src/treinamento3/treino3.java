package treinamento3;

import java.util.Scanner;

public class treino3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = 0;
        double saldoReajuste = 0;
        double valorTotal = 0;

        System.out.println("Me informe um saldo: ");
        saldo = scan.nextDouble();

        saldoReajuste = saldo * 0.01;

        valorTotal = saldoReajuste + saldo;


        System.out.println("Seu saldo com reajuste de 1% é de: " + valorTotal

        );

    }
}
