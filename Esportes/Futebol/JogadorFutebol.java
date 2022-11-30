import java.util.ArrayList;

import Esportes.Interfaces.*;

public class JogadorFutebol extends Atleta{

    private int numero;
    private PosicoesFutebol posicao;
    private Titularidade titularidade;

     //lista de todos os jogadores de futebol com inscrição
    private static ArrayList<JogadorFutebol> listaTodosJogFutebol = new ArrayList<>();
    //func add faltando
    
    public JogadorFutebol(){}

    public JogadorFutebol(int numero, PosicoesFutebol posicao, Titularidade titularidade){

        this.numero = numero;
        this.posicao = posicao;
        this.titularidade = titularidade;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public PosicoesFutebol getPosicao(){
        return this.posicao;
    }
    /*
    public void setPosicao(PosicoesFutebol posicao){
        this.posicao = PosicoesFutebol.posicao;
    }
    */
    public void mudarTitularidade(){
        if(this.titularidade ==  Titularidade.Titular)
            this.titularidade = Titularidade.Reserva;
        else
            this.titularidade = Titularidade.Titular;
    }
}