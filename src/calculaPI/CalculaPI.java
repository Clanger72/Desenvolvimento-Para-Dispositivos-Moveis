package calculaPI;

public class CalculaPI {
    public static void main(String args[]) {
        int max = Integer.parseInt(args[0]);
        double soma =0;
        int divisor = 1;
        double numerador = 1.0;

        for(int i = 0; i < max; i++){
            soma += numerador / divisor;
            numerador *= -1.0;
            divisor += 2;
        }

        double result = 4 * soma;
        double erro = 1 - (result / Math.PI);
        System.out.println("PI = "+result);
        System.out.println("Erro = "+erro);
    }
}
