package cartas;

public class CartasTest {
    public static void main(String[] args){
        Baralho b = new Baralho();
        b.embaralhar();
        boolean baralhoNovo = true;

        while(baralhoNovo){
            try{
                System.out.println("Distribuindo " + b.distribuir());
            }catch (IndexOutOfBoundsException ex){
                System.out.println("Nenhuma carta no baralho! Fim de jogo! ");
                baralhoNovo = false;
            }
        }
    }
}
