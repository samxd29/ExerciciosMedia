package treinamento2;

public class Média {
    public static void main(String[] args) {
        CalculoMedia calculoMedia = new CalculoMedia();
        calcularMedia calcularMedia = new calcularMedia();

        System.out.println("Calculo da média 1 é de: " +calculoMedia.medianaNumeros());
        System.out.println("Calculo da média 2 é de: " +calcularMedia.mediaNumeros());

        double somaDasMedias = 0;
        somaDasMedias = calculoMedia.medianaNumeros() + calcularMedia.mediaNumeros();

        System.out.println("A soma das duas média é: " + somaDasMedias);

        double mediaDasMedias =somaDasMedias / 2;

        System.out.println("A média das médias é: " + mediaDasMedias);

    }
}
