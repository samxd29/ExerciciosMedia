package treinamento1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int idade;
        int ano;
        int meses;
        int dias;
        int calculo;

        Scanner scan = new Scanner(System.in);
        System.out.println("Me informe a sua idade em anos: ");
        ano = scan.nextInt();

        System.out.println("Me informe quantos meses você tem: ");
        meses = scan.nextInt();

        System.out.println("Me informe quantos dias vc tem: ");
        dias = scan.nextInt();

        calculo = (ano * 365) + (meses * 30) + dias;

        System.out.println("Sua idade em dias é: " + calculo);








    }
}
