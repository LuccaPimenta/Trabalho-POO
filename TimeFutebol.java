import java.util.ArrayList;

public class TimeFutebol implements AttPontos{

    private String nome;
    private int pontos = 0;
    final private int MAX = 30;

    ArrayList<JogadorFutebol> listaJogadores = new ArrayList<>(MAX);

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

    public void addJogador(JogadorFutebol jogador){

        if(listaJogadores.size() < MAX)
            listaJogadores.add(jogador);

        else
            System.out.println("Quantidade máxima atingida!");
    }

    public void imprimeJogadores(){
        for(JogadorFutebol jogador:listaJogadores){
            System.out.println(jogador.getNome() + " : Numero " + jogador.getNumero() + " " + jogador.getPosicao() + "\n" + jogador);
        }
    }
}