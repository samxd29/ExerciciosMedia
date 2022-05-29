package treinamento2;

public class CalculoMedia {
    int[] numeros = {8,9,7};

    public double medianaNumeros(){
        double soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }
        return soma / 3;
    }
}
