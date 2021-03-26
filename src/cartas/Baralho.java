package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho{

    private List<Carta> monte;
    private int cartaAtual;
    private static final int TOTAL_DE_CARTAS = 52;
    private static  final String[] NAIPES = {
            "Paus", "Ouro", "Copas", "Espadas"
    };
    private static  final String[] VALORES = {
            "Ás", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"
    };

    public Baralho() {
        //Instancia monte recebe total de cartas
        monte = new ArrayList<>(TOTAL_DE_CARTAS);

        //Para cada naipe faça
        for(String naipe : NAIPES){
            //Para cada valor faça
            for(String valor : VALORES){
                //crie uma carta com naipe e valor
                Carta c = new Carta(naipe, valor);
                //insira no monte
                monte.add(c);
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(monte);
        cartaAtual = 0;
    }

    public Carta distribuir(){
        if(monte.isEmpty()){
            throw new IndexOutOfBoundsException("O baralho está vazio.");
        }
        return monte.get(cartaAtual++);
    }

}
