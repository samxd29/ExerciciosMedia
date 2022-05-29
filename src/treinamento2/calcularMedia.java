package treinamento2;

public class calcularMedia {
    int[] numeros = {4,5,6};


    public double mediaNumeros(){
        double soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma =soma + numeros[i];
        }
        return soma / 3;
    }
}
