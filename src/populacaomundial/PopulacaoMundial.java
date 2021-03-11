package populacaomundial;

public class PopulacaoMundial {
    public static void main(String args[]) {
        int anos = Integer.parseInt(args[0]);
        double pop = 7849971766.0;
        // formula dos juros compostos
        double popFutura = pop * Math.pow(1 + 0.0105, anos);
        for(int i = 0; i < anos; i++){
            pop = pop + (pop * 0.0105);
        }
        System.out.printf("%, .0f pessoas. \n", pop);
        System.out.printf("%, .0f pessoas. \n", popFutura);
    }
}
