package treinamento6;

import java.util.Scanner;

public class treino6 {
    public static void main(String[] args) {

        int valor = 0;
        int antecessor = 0;
        int sucessor = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Me informe um número: ");
        valor = scan.nextInt();

        sucessor = valor + 1;

        antecessor = valor - 1;

        System.out.println("O sucessor do valor " + valor + " é o número " + sucessor + " e seu antecessor é o número " + antecessor);
    }
}
