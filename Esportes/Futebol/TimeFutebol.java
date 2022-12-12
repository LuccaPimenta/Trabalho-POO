import java.util.ArrayList;
import java.util.Scanner;

public class TimeFutebol{

    private String nome;
    private int pontos = 0;
    final static private int MAX = 30;

    private ArrayList<JogadorFutebol> listaJogadores;

    public TimeFutebol(){}

    public TimeFutebol(String nome, int pontos){
        listaJogadores = new ArrayList<>(MAX);
        this.nome = nome;
        this.pontos = pontos;
    }

    public TimeFutebol(Scanner input){
        this.nome = input.next();
        this.pontos = 0;//input.nextInt()
    }
    
    public void attPontos(int pontosGanhos){
        this.pontos += pontosGanhos;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPontos(){
        return this.pontos;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public static int getMAX(){
        return MAX;
    }

    public void addJogador(JogadorFutebol jogador){

        if(listaJogadores.size() < MAX)
            listaJogadores.add(jogador);

        else
            System.out.println("Quantidade máxima atingida!");
    }

    public void imprimeJogadores(){
        for(JogadorFutebol jogador:listaJogadores){
            System.out.println(jogador.getNome() + " : Numero " + jogador.getNumero() + " " + jogador.getPosicao() + " " + jogador.getTitularidade());
        }
    }

}