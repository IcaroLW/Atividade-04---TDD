public class Fatorial {

    public static long calcular(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser inteiro positivo.");
        }

        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        long resultado = calcular(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
}
