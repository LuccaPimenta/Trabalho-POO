public class Atleta{

    protected String nome;
    protected float altura;
    protected float peso;
    protected int numInscricao;
    protected static int qAtletas = 0;

    public Atleta(){}

    public Atleta(String nome, float altura, float peso){
        qAtletas++;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.numInscricao = qAtletas;
    }
    
    public String getNome(){
        return this.nome;
    }

    public float getAltura(){
        return this.altura;
    }

    public float getPeso(){
        return this.peso;
    }

    public int getNumInscricao(){
        return this.numInscricao;
    }

    public int getQAtletas(){
        return qAtletas;
    }
}