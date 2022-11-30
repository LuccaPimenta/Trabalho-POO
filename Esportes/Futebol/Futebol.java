import java.util.ArrayList;

public class Futebol extends Esporte{
    
    final static private int MAX = 20;
    
    private ArrayList<TimeFutebol> listaTimes;

    public Futebol(){
         listaTimes = new ArrayList<TimeFutebol>(MAX);
    }

    //ArrayList<TimeFutebol> listaTimes = new ArrayList<TimeFutebol>(MAX); --> diferente de cima?
    
    /*
    public Futebol(String nome, int pontos){
        time = new TimeFutebol();
        time.setNome(nome);
        time.attPontos(pontos);
    }
    */
    
    public void imprimeTimes(){
        for(TimeFutebol time:listaTimes){
            System.out.println(time.getNome() + " : " + time.getPontos() + " pontos");
            //time.imprimeJogadores(); //teste
        }
        System.out.println();
        /*
        for(int i=0; i<times.size(); i++)
            System.out.println(i + "- " + times.get(i).getNome() + " : " + times.get(i).getPontos() + " pontos");
        */
    }

    //testando
    public void imprimeUmTime(TimeFutebol time){
        System.out.println(time.getNome() + " : " + time.getPontos() + " pontos");
        time.imprimeJogadores();
    }
    
    public void addTime(TimeFutebol time){
        
        if(listaTimes.size() < MAX)
            listaTimes.add(time);

        else
            System.out.println("Quantidade máxima atingida!");
    }

    public void removeTime(int i){
        if(i > 0 && i < listaTimes.size())
            listaTimes.remove(i-1);
    }

    public int getMAX(){
        return MAX;
    }
}