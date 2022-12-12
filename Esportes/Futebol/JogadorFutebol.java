import java.util.ArrayList;
import java.util.Scanner;
import java.util.Enumeration;

public class JogadorFutebol extends Atleta{

    private int numero;
    private PosicoesFutebol posicao;
    private Titularidade titularidade;
    
    public JogadorFutebol(){}

    public JogadorFutebol(String nome, int numero, String posicao, String titularidade){

        this.nome = nome;
        this.numero = numero;
        
        try{
            this.posicao = PosicoesFutebol.valueOf(posicao);
        }
        catch(IllegalArgumentException erro){
            System.out.println("ERRO: Posicao invalida");
        }
        
        try{
            this.titularidade = Titularidade.valueOf(titularidade);
        }
        catch(IllegalArgumentException erro){
            System.out.println("ERRO: Titularidade invalida");
        }
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
    
    public void setPosicao(String posicao){
        this.posicao = PosicoesFutebol.valueOf(posicao.toUpperCase());
    }

    public Titularidade getTitularidade(){
        return this.titularidade;
    }
    
    public void mudarTitularidade(){
        if(this.titularidade ==  Titularidade.TITULAR)
            this.titularidade = Titularidade.RESERVA;
        else
            this.titularidade = Titularidade.TITULAR;
    }
}