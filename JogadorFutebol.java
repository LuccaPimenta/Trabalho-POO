public class JogadorFutebol{

    private String nome;
    private int numero;
    private PosicoesFutebol posicao;
    private Titularidade titularidade;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
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